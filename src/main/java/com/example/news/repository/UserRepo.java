package com.example.news.repository;

import com.example.news.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> getAllUsers();

    @Query("select user from User user where user.id = ?1")
    User findById(Integer userId);

}
