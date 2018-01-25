package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {

    void create(User user);
    void delete(String lastName);
    void update(User user);
    User read(String lastName);
    List<User> readAll();
}
