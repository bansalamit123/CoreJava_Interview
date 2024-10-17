package com.rays.exception;
// Custom exception for login errors
public class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}
