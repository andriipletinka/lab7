package com.example.lab7.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController() {
        this.userService = new UserService();
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}