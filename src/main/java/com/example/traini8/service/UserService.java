
package com.example.traini8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.traini8.model.training_centers;

import com.example.traini8.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public training_centers saveUser(training_centers user) {
        return userRepository.save(user);
    }

    @Override
    public List<training_centers> getAllUsers() {
        return userRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

}
