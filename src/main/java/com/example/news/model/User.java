package com.example.news.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static org.springframework.util.Assert.notNull;

@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user_name")
    private String userName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="user_type")
    private String userType;

    @Column(name="registration_date")
    private Date registrationDate;

    public User() {}

    public User(String userName, String email, String password, String userType, Date registrationDate) {
        // constructor with required field
        notNull(userName, "Method called with null parameter (application)");
        notNull(email, "Method called with null parameter (name)");

        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.registrationDate = registrationDate;
    }

    public String setUserName(String userName){
        this.userName = userName;
        return  userName;
    }
    public String setEmail(String email) {
        this.email = email;
        return email;
    }
    public String setPassword(String password) {
        this.password = password;
        return password;
    }
    public String setUserType(String userType) {
        this.userType = userType;
        return userType;
    }

    public String getUserName(){
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getUserType() {
        return userType;
    }
}
