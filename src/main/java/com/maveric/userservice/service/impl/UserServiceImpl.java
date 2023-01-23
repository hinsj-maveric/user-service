package com.maveric.userservice.service.impl;

import com.maveric.userservice.exception.UserNotFoundException;
import com.maveric.userservice.repository.UserRepository;
import com.maveric.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void deleteUser(long id) {
        if (userRepository.findById(id).isPresent()){
            userRepository.deleteById(id);
        }
        else {
            throw new UserNotFoundException("User not found with id " + id);
        }
    }
}
