package com.maveric.userservice.service;

import com.maveric.userservice.dto.UserDto;
import com.maveric.userservice.model.User;

public interface UserService {
    User createUser(User user);
}
