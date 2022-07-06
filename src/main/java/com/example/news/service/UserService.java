package com.example.news.service;

import com.example.news.model.User;
import com.example.news.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createNewUser(String userName, String email, String password, String userType, Date registrationDate) {
        User user = new User(userName, email, password, userType, registrationDate);
        User savedUser = userRepo.save(user);
        return savedUser;
    }

    public User getUserById(Integer id) {
        User foundUser = userRepo.findById(id);
        System.out.println("user is" + foundUser.toString());
        return foundUser;
    }

    public List<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.addAll(userRepo.getAllUsers());
        return users;
    }

    public User updateUser(User user, Integer id) {
        User userToUpdate = userRepo.findById(id);
        return userToUpdate;
    }

    public User deleteUser(Integer id) {
        User foundUser = userRepo.findById(id);
        userRepo.delete(foundUser);
        return foundUser;
    }
}
