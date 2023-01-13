package com.maveric.userservice.service;

import com.maveric.userservice.dto.UserDto;
import com.maveric.userservice.model.User;

public interface UserService {
    UserDto updateUser(UserDto userDto, long userId);
}
