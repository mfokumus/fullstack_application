package com.mfokumus.fullstackbackend.controller;

import com.mfokumus.fullstackbackend.model.User;
import com.mfokumus.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //send data to database
    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    //pull data from database
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
