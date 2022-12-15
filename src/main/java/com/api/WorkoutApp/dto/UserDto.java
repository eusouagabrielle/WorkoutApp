package com.api.WorkoutApp.dto;

import com.api.WorkoutApp.model.Authority;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    public String username;
    public String password;
    @JsonSerialize
    public Set<Authority> authorities;
}
