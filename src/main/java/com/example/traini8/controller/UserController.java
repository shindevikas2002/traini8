package com.example.traini8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import com.example.traini8.model.training_centers;
import com.example.traini8.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService; // we are bringing in User Service instance
    // @Autowired
    // private EmployeeService employeeService; // Autowire EmployeeService for
    // managing employees

    // This is a post request, here we are going to be saving a user

    // Gets all users
    @GetMapping
    public ResponseEntity<List<training_centers>> getAllUsers() {
        List<training_centers> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<training_centers> createUser(@RequestBody training_centers user) {
        training_centers savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}
