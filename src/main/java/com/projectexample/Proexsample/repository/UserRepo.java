package com.projectexample.Proexsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectexample.Proexsample.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
