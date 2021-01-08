package com.wcs.checkpoint3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.checkpoint3.entity.User;
import com.wcs.checkpoint3.repository.UserRepository;
import com.wcs.checkpoint3.service.UserService;

@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev/", maxAge = 3600)
    @RestController
    @RequestMapping("/user")



        public class UserController {

    @Autowired
    UserService  userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> readAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User read(@RequestParam(value="id") Long id) {
        return userService.getUserById(id);
    }
}