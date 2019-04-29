package com.demo.serviceImpl;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sch
 * @create 2019/3/29
 */
//业务逻辑实现层
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    // 根据用户id获取用户
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    // 根据用户name获取用户
    public User getUserByName(String name) {
        return userMapper.selectByPrimaryName(name);
    }

    @Override
    // 增加一个用户
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}