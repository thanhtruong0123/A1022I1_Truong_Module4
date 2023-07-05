package com.example.rigisterformproject.service;

import com.example.rigisterformproject.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void addNewUser(User user);

    void removeUser(Long id);

    void updateUser(Long id, User user);
}
