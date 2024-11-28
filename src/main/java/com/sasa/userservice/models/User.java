package com.sasa.userservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Getter
@Setter
@Entity(name="users")
public class User extends BaseModel{
    private String name;
    private String email;
    private String hashedPassword;
    @ManyToMany
    private List<Role> roles;
}
