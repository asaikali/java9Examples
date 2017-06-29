package com.example.app;


import com.example.user.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        boolean active = userService.isActive("kim@exmaple.com");
        if(active) {
            System.out.println("kim@example.com is an active user");
        }
    }
}
