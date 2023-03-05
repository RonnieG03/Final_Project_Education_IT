package com.project.shoppincart.controller;

import com.project.shoppincart.model.Product;
import com.project.shoppincart.model.User;
import com.project.shoppincart.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        LOGGER.info("New user registration{}",user);
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        LOGGER.info("Get user by Id{}", id);
        Optional<User> userOptional = userService.findById(id);
        return userOptional
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
