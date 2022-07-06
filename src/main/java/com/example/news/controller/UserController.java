package com.example.news.controller;

import com.example.news.model.User;
import com.example.news.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/helloWorld", method = RequestMethod.GET)
    public ResponseEntity<String> helloWorld() {
        // return "Hello World!";
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @RequestMapping(path = "/createNewUser", method = RequestMethod.POST)
    public ResponseEntity<User> createNewUser(@RequestBody Map<String, String> body) {
        String userName = body.get("userName");
        String email = body.get("email");
        String password = body.get("password");
        String userType = body.get("userType");
        Date registrationDate = new Date();
        return new ResponseEntity<>(userService.createNewUser(userName, email, password, userType, registrationDate),
                HttpStatus.OK);
    }

    @RequestMapping(path = "/getAllUsers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @RequestMapping(path = "/getUserById/{userId}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable("userId") Integer userId) {
        User user = userService.getUserById(userId);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
