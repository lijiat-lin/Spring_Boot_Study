package com.lijiat.springboot.jpa.controller;

import com.lijiat.springboot.jpa.domain.User;
import com.lijiat.springboot.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @program: demo7-jpa
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 14:08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/find")
    public User find(@RequestParam("id") Integer id){
        return userRepository.getOne(id);
    }

    @PostMapping("/insert")
    public User insert(User user){
        return userRepository.save(user);
    }
}
