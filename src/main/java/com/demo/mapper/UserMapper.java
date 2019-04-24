package com.demo.mapper;

import com.demo.entity.User;

//用户的数据库接口操作
public interface UserMapper {
    // 根据用户id删除用户
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    // 根据用户id获取用户
    User selectByPrimaryKey(Integer id);

    // 根据用户name获取用户
    User selectByPrimaryName(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}