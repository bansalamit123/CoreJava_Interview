		package com.rays.exception;
public class LoginService {

    // Sample method to simulate login
    public void login(String username, String password) throws LoginException {
        // Hardcoded correct credentials for demonstration
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Validate credentials
        if (!username.equals(correctUsername)) {
            throw new LoginException("Invalid username!");
        }

        if (!password.equals(correctPassword)) {
            throw new LoginException("Invalid password!");
        }

        // If credentials are correct
        System.out.println("Login successful!");
    }

    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        try {
            // Attempt to login with given credentials
            loginService.login("admin", "wrongPassword");
        } catch (LoginException e) {
            // Handle the custom exception
            System.err.println("Login failed: " + e.getMessage());
        }
    }
}
