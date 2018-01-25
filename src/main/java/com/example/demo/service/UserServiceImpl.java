package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public void create(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(String lastName) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User read(String lastName) {
        return userDao.findByLastName(lastName);
    }

    @Override
    public List<User> readAll() {
        return null;
    }
}
