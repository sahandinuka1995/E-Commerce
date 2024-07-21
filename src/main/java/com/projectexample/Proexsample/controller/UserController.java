package com.projectexample.Proexsample.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectexample.Proexsample.dto.User;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
    ArrayList<String> users = new ArrayList<>();

    @GetMapping
    public ArrayList<String> getUser() {
        return users;
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        users.add(user.getName());
        return"User Saved Successfully";
    }
}
