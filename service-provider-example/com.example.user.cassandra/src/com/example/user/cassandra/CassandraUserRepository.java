package com.example.user.cassandra;

import com.example.user.db.User;
import com.example.user.db.UserRepository;


public class CassandraUserRepository
        implements UserRepository
{
    private CassandraUserRepository()
    {

    }

    public static CassandraUserRepository provider()
    {
        return new CassandraUserRepository();
    }

    @Override
    public User findByEmail(String email) {
        System.out.println("CassandraUserRepository.findByEmail");
        // put real code here to talk to Cassandra
        return  new User(email,email);
    }
}
