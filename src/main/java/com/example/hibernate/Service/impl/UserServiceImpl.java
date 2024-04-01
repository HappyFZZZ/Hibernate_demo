package com.example.hibernate.Service.impl;

import com.example.hibernate.Service.UserService;
import com.example.hibernate.dao.UserDao;
import com.example.hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
        return userDao.findAll();
    }


}
