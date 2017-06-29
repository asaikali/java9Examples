package com.example.user;


import com.example.user.db.User;
import com.example.user.db.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        ServiceLoader<UserRepository> loader = ServiceLoader.load(UserRepository.class);
        List<UserRepository> userRepositories = new ArrayList<>();

        for (UserRepository repository: loader){
            System.out.println(repository.getClass().getTypeName());
            userRepositories.add(repository);
        }

        if(userRepositories.isEmpty()){
            throw new RuntimeException("Cloud not find a UserRepository Service Implementation");
        }

        this.userRepository = userRepositories.get(0);
    }

    public boolean isActive(String email){
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return false;
        } else {
            return true;
        }
    }
}
