package com.jwtsecurity.jwt_security.service.impl;


import com.jwtsecurity.jwt_security.entity.User;
import com.jwtsecurity.jwt_security.repository.UserRepository;
import com.jwtsecurity.jwt_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> readById(long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
