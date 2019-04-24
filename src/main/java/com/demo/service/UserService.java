package com.demo.service;

import com.demo.entity.User;

//业务逻辑接口层
public interface UserService {
    // 根据用户id获取用户
    User getUserById(int id);

    // 根据用户name获取用户
    User getUserByName(String name);

    // 增加一个用户
    int addUser(User user);
}