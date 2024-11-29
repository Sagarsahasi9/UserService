package com.sasa.userservice.dtos;

import com.sasa.userservice.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private User user;
}
