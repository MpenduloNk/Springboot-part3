package com.springboot.dao;

import com.springboot.model.User;

import java.util.Collection;

public interface FakeRepoInterface {
    Collection<User> getAllUsers();

    User findUserById(int id);

    User deleteUserById(int id);

    void insertUser(User userX);
}
