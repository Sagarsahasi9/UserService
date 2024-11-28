package com.sasa.userservice.services;

import com.sasa.userservice.models.Token;
import com.sasa.userservice.models.User;

public interface UserService {
    public User signup(String name, String email, String password);
    public Token login(String email, String password);
    public User validate(String token);
    public void logout(String token);

}
