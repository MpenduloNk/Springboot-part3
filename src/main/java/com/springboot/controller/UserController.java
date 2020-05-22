package com.springboot.controller;

import com.springboot.model.User;
import com.springboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Component
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

//    @RequestMapping(method =  RequestMethod.GET)
    @RequestMapping(value="/all",method = RequestMethod.GET )
    public Collection<User> getALLUsers(){
        return this.userServiceImpl.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") int id){
        return this.userServiceImpl.findUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public User deleteUserById(@PathVariable("id") int id){
        return this.userServiceImpl.deleteUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertUser(@RequestBody User user){
        userServiceImpl.insertUser(user);
    }

    public String getUser(int id) {
        User user = userServiceImpl.findUserById(id);
        String name = user.getName();
        return "Hello "+ name;
    }

    public String removeUser(int id){
        User user = userServiceImpl.deleteUserById(id);
        String name = user.getName();
        return name + " removed";
    }

    public String addUser(int id, String name, String surname){
        User s = new User();
        s.setName(name);
        s.setSurname(surname);
        s.setId(id);
        userServiceImpl.insertUser(s);

        return s.getName() + " entered";
    }
}
