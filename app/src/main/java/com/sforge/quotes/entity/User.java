package com.sforge.quotes.entity;

/**
 * User entity.
 * Carries information about logged-in user.
 */
public class User {

    /**
     * Username field.
     */
    private String username;

    /**
     * Email of the user.
     */
    private String email;

    public User() {
    }

    /**
     * Constructor for immutable instance creation.
     * @param username Username
     * @param email email of the user.
     */
    public User(final String username, final String email){
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
