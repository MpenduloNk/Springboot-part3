package com.springboot.service;

import com.springboot.dao.FakeRepo;
import com.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;
    public Collection<User> getAllUsers(){
       return fakeRepo.getAllUsers();
    }

    @Override
    public User findUserById(int id){
        return this.fakeRepo.findUserById(id);
    }

    @Override
    public User deleteUserById(int id){
        return this.fakeRepo.deleteUserById(id);
    }

    @Override
    public void insertUser(User userX){
        this.fakeRepo.insertUser(userX);
    }
}
