package com.ssjethwa.elearning.controller;

import com.ssjethwa.elearning.model.ELearnUser;
import com.ssjethwa.elearning.repository.UserRepository;
import com.ssjethwa.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ELearnUser saveUser(@RequestBody ELearnUser eLearnUser){
        return userService.saveUser(eLearnUser);
    }
}
