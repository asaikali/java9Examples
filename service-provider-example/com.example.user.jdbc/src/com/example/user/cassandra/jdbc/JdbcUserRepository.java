package com.example.user.cassandra.jdbc;

import com.example.user.db.User;
import com.example.user.db.UserRepository;

public class JdbcUserRepository implements UserRepository
{

    @Override
    public User findByEmail(String email) {
        System.out.println("JdbcUserRepository.findByEmail");
        // real code for reading from the database should go here
        return new User(email,email);
    }
}
