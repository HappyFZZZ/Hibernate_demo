package com.example.hibernate.Service;

import com.example.hibernate.entity.User;

import java.util.List;

public interface UserService {
    /***
     * 查询所有用户
     */
    List<User> selectAll();
}
