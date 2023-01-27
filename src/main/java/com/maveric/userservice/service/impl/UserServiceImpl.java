package com.maveric.userservice.service.impl;

import com.maveric.userservice.converter.DtoToModelConverter;
import com.maveric.userservice.dto.UserDto;
import com.maveric.userservice.exception.EmailDuplicateException;
import com.maveric.userservice.exception.UserNotFoundException;
import com.maveric.userservice.model.User;
import com.maveric.userservice.repository.UserRepository;
import com.maveric.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    private DtoToModelConverter dtoToModelConverter;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserDto updateUser(UserDto userDto, long userId) {
        User existingUser = userRepository.findById(userId).orElseThrow(
                ()->new UserNotFoundException("User not Found with id " + userId));
        if(userRepository.findUserByEmail(userDto.getEmail()).isPresent()){
            throw new EmailDuplicateException("Duplicate Email");
        }

        existingUser.setFirstName(userDto.getFirstName());
        existingUser.setLastName(userDto.getLastName());
        existingUser.setMiddleName(userDto.getMiddleName());
        existingUser.setAddress(userDto.getAddress());
        existingUser.setGender(userDto.getGender());
        existingUser.setDateOfBirth(userDto.getDateOfBirth());
        existingUser.setPhoneNumber(userDto.getPhoneNumber());
        existingUser.setEmail(userDto.getEmail());

        User updatedUser = userRepository.save(existingUser);
        UserDto userDto1 = dtoToModelConverter.userToDtoUpdate(updatedUser);
        return userDto1;
    }
}