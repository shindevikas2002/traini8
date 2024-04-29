package com.example.traini8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.traini8.model.training_centers;

@Repository
public interface UserRepository extends JpaRepository<training_centers, Integer> {

}
