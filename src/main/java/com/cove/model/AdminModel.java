package com.cove.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admins")
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private int authorized; // 1 = student, 2 = instructor, 3 = admin
    private String email;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
 
    public int getAuthorized() {
        return authorized;
    }
    public void setAuthorized(int authorized) {
        this.authorized = authorized;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public AdminModel(int id, String username, String password, int authorized, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorized = authorized;
        this.email = email;
    }
    public AdminModel() {
    }

    
}
