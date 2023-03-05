package com.project.shoppincart.service;

import com.project.shoppincart.model.User;

import java.util.Optional;

public interface UserService{
    Optional<User> findById(Long id);
    User save(User user);

}
