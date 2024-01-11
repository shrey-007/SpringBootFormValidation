package com.validation.SpringValidation.entity;

import jakarta.validation.constraints.*;



public class User {
    @NotBlank(message = "UserName can not be empty")
    @Size(min = 3,max = 12,message = "User name must be between 3-12 characters !!")
    private String userName;

    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid email")
    private String email;

    @AssertTrue(message = "must agree terms and conditions")
    private boolean agreed;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public User() {
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
