package com.maveric.userservice.service;

import com.maveric.userservice.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers(int page, int pageSize);
}
