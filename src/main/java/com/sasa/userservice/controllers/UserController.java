package com.sasa.userservice.controllers;

import com.sasa.userservice.dtos.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    public SignUpResponseDto signup(SignUpRequestDto requestDto)
    {
        return null;
    }
    public LoginResponseDto login(LoginRequestDto requestDto)
    {
        return null;
    }

    public UserDto validate(@RequestHeader("Autorization") String token)
    {
        return null;
    }
    public void logout()
    {

    }
}