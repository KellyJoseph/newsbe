package com.example.news.service.impl;

import com.example.news.exception.ResourceNotFoundException;
import com.example.news.model.User;
import com.example.news.repository.UserRepo;
import com.example.news.service.UserService;

import java.util.List;

public class UserServiceImpl  {
//    private UserRepo userRepo;
//
//    public UserServiceImpl(UserRepo UserRepo) {
//        super();
//        this.userRepo = UserRepo;
//    }
//
//    @Override
//    public User saveUser(User user) {
//        return userRepo.save(user);
//
//    }
//
//    @Override
//    public User getUserById(Long id) {
////		Optional<Employee> employee = employeeRepo.findById(id);
////		if(employee.isPresent()) {
////			return employee.get();
////		}else {
////			throw new ResourceNotFoundException("Employee", "Id", id);
////		}
//        return userRepo.findById(id).orElseThrow(() ->
//                new ResourceNotFoundException("User", "Id", id));
//
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//
//        return userRepo.findAll();
//    }
//
//    @Override
//    public User updateUser(User User, Long id) {
//
//        // we need to check whether employee with given id is exist in DB or not
//        User existingUser = userRepo.findById(id).orElseThrow(
//                () -> new ResourceNotFoundException("User", "Id", id));
//
//        //existingUser.setFirstName(User.getFirstName());
//        //existingUser.setLastName(User.getLastName());
//        //existingUser.setEmail(User.getEmail());
//        // save existing User to DB
//        userRepo.save(existingUser);
//        return existingUser;
//    }
//
//    @Override
//    public User deleteUser(Long id) {
//        // check whether a User exist in a DB or not
//        userRepo.findById(id).orElseThrow(() ->
//                new ResourceNotFoundException("User", "Id", id));
//        userRepo.deleteById(id);
//        return null;
//    }

}
