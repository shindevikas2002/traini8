package com.example.traini8.service;

import java.util.*;

import com.example.traini8.model.*;

public interface UserServiceInterface {

    training_centers saveUser(training_centers user);

    List<training_centers> getAllUsers();

}
