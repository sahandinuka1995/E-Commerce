package com.projectexample.Proexsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectexample.Proexsample.dto.UserDTO;
import com.projectexample.Proexsample.entity.User;
import com.projectexample.Proexsample.repository.UserRepo;
import com.projectexample.Proexsample.util.StanderdResponse;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity<StanderdResponse> addNewUser(@RequestBody UserDTO userDto){
        try {
            User user = new User();
            user.setName(userDto.getName());
            user.setTel(userDto.getTel());
            user.setAddress(userDto.getAddress());
            user.setpassword(userDto.getPassword());

            userRepo.save(user);
            return ResponseEntity.ok(new StanderdResponse(0, "", "Operation Successfuly", true));

        } catch (Exception e) {
            return ResponseEntity.ok(new StanderdResponse(1, "", "something went wrong", false));
        }
        
    }
}
