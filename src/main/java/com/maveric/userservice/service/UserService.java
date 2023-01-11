package com.maveric.userservice.service;

import com.maveric.userservice.model.User;

public interface UserService {
    User updateUser(User user, long userId);
}
