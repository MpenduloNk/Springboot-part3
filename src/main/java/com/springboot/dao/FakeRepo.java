package com.springboot.dao;


import com.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface {

    private static Map<Integer, User> user;
    static {
        user = new HashMap<Integer, User>(){
            {
                put(1, new User(1, "Mercy","Kings"));
                put(2, new User(2, "Jack","Johnson"));
                put(3, new User(3, "Roddy","Rich"));
            }
        };
    }

    @Override
    public Collection<User> getAllUsers(){
        return this.user.values();
    }

    @Override
    public User findUserById(int id){
        return this.user.get(id);
    }

    @Override
    public User deleteUserById(int id){
        return this.user.get(id);
    }

    @Override
    public void insertUser(User userX){
       this.user.put(userX.getId(), userX);
    }

}
