package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {

    @NotBlank(message = "required")
    @Size(min = 5,max = 15)
    private String username;
    @Email
    private String email;
    @NotBlank(message = "required")
    @Min(6)
    private String password;
    @NotBlank(message = "required")
    private String verify;

// constructors for field
    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    // creating constructor with empty body, used to assign default value in field of class
    public User() {}

 //Getters and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
