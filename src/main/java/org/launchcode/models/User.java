package org.launchcode.models;

import jakarta.validation.constraints.*;

public class User {

    @NotBlank(message = "required")
    @Size(min = 5,max = 15)
    private String username;

    @NotBlank(message = "email is optional")
    @Email
    private String email;

    @NotNull(message = "Passwords do not match")
    @Min(6)
    private String password;

    @NotNull(message = "required")
    private String verifyPassword;

    // creating constructor with empty body, used to assign default value in field of class

    public User() {

    }


    // constructors for field
    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }


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

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public void setPassword(String password) {
        this.password = password;




    }
}
