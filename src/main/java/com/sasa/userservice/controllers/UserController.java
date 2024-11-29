package com.sasa.userservice.controllers;

import com.sasa.userservice.dtos.*;
import com.sasa.userservice.models.Token;
import com.sasa.userservice.models.User;
import com.sasa.userservice.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    public UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public SignUpResponseDto signup(@RequestBody SignUpRequestDto requestDto)
    {
        User user = userService.signUp(
                requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword());

        SignUpResponseDto responseDto = new SignUpResponseDto();
        responseDto.setUser(user);
        return responseDto;
    }
    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequestDto requestDto)
    {
        Token token=userService.login(requestDto.getEmail(), requestDto.getPassword());
        LoginResponseDto responseDto = new LoginResponseDto();
        responseDto.setToken(token);
        return responseDto;
    }
    @PostMapping("/validate")
    public UserDto validate(@RequestHeader("Autorization") String token)
    {
        User user=userService.validate(token);
        return UserDto.fromUser(user);
    }
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestBody LogoutRequestDto logoutRequestDto)
    {
        userService.logout(logoutRequestDto.getToken());
         return new ResponseEntity<>(HttpStatus.OK);
    }
}
