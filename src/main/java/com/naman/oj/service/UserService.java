package com.naman.oj.service;

import com.naman.oj.dto.UserDto;
import com.naman.oj.dto.UserResponseDto;
import com.naman.oj.model.User;

public interface UserService {

    public User registerUser(UserDto userDto);
}
