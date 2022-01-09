package com.enigma.userservice.service;

import com.enigma.userservice.domain.Role;
import com.enigma.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);

    void assignRoleToUser(String username, String roleName);

    User getUser(String username);
    List<User> getUsers();
}
