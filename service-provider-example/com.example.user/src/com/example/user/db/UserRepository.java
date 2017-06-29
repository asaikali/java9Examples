package com.example.user.db;


public interface UserRepository {

    public User findByEmail(String email);
}
