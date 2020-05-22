package com.springboot.service;

import com.springboot.model.User;

public interface UserService {
    User findUserById(int id);

    User deleteUserById(int id);

    void insertUser(User userX);
}
