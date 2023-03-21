package com.project.shoppincart.service.Impl;

import com.project.shoppincart.model.UserEntity;
import com.project.shoppincart.repository.UserRepository;
import com.project.shoppincart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }
    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }


}
