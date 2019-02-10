package com.hb.udemyrestfulservice.user.controller;

import com.hb.udemyrestfulservice.user.model.User;
import com.hb.udemyrestfulservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.findUserById(userId);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
