package com.api.WorkoutApp.service;

import com.api.WorkoutApp.dto.RoleDto;
import com.api.WorkoutApp.dto.UserDto;
import com.api.WorkoutApp.model.Authority;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<UserDto> getUsers();
    UserDto getUser(String username);
    String createUser(UserDto userDto);
    void updateUser(String username, UserDto dto);
    Set<Authority> getAuthorities(String username);
    void addAuthority(String username, String authority);
    void removeAuthority(String username, String authority);
    void deleteUser(String username);
}
