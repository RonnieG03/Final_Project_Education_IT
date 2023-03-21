package com.project.shoppincart.service;

import com.project.shoppincart.model.UserEntity;

import java.util.Optional;

public interface UserService{
    Optional<UserEntity> findById(Long id);
    UserEntity save(UserEntity userEntity);

}
