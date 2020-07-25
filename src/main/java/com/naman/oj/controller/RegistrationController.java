package com.naman.oj.controller;

import com.naman.oj.dto.ResponseDto;
import com.naman.oj.dto.UserDto;
import com.naman.oj.dto.UserResponseDto;
import com.naman.oj.model.User;
import com.naman.oj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public ResponseDto<UserResponseDto> registerUser(@RequestBody UserDto userDto) {

        User user = userService.registerUser(userDto);
        return new ResponseDto<>(
                HttpStatus.OK,
                new UserResponseDto( user.getId(), user.getFullName(), user.getEmail(),  user.isActive())
        );
    }
}
