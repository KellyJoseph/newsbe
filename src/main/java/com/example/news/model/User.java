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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    public User (){

    }

    public void setUserName(){

    }
    public void setEmail() {

    }
    public void setPassword() {

    }
    public void setUserType() {

    }
}
