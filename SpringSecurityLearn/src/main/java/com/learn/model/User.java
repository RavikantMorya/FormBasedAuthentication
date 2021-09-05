package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private  String username;
    private String password;
    private  String email;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String role;

    public String getUsername() {
        return username;
    }

    public User() {
    }

    public User(String username, String password, String email,String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role=role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


}
