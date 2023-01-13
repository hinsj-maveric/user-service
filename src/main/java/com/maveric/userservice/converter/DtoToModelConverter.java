package com.maveric.userservice.converter;

import com.maveric.userservice.dto.UserDto;
import com.maveric.userservice.model.User;
import org.springframework.stereotype.Component;

@Component
public class DtoToModelConverter {
//    public User dtoToUserUpdate(UserDto userDto) {
//        User user = new User();
//        user.setId(userDto.getId());
//        user.setFirstName(userDto.getFirstName());
//        user.setMiddleName(userDto.getMiddleName());
//        user.setLastName(userDto.getLastName());
//        user.setEmail(userDto.getEmail());
//        user.setPhoneNumber(userDto.getPhoneNumber());
//        user.setAddress(userDto.getAddress());
//        user.setDateOfBirth(userDto.getDateOfBirth());
//        user.setGender(userDto.getGender());
//        return user;
//    }

    public UserDto userToDtoUpdate(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setMiddleName(user.getMiddleName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setAddress(user.getAddress());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setGender(user.getGender());
        return userDto;
    }
}