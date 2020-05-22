package com.springboot;

import com.springboot.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = SpringApplication.run(Main.class, args);
        UserController userController = cxt.getBean(UserController.class);

        System.out.println(userController.getUser(1));
        System.out.println(userController.getUser(2));
        System.out.println(userController.addUser(44,"Wilson", "Vikky"));

        System.out.println(userController.removeUser(3));

    }
}
