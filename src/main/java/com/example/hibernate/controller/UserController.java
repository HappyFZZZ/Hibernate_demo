package com.example.hibernate.controller;

import com.example.hibernate.Service.UserService;
import com.example.hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> getAll(){
        return userService.selectAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable("id")Integer id){
        return userService.selectOne(id);
    }

}
