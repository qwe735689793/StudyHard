package com.demo.mapper;

import com.demo.entity.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Class record);

    int insertSelective(Class record);

    // 根据班级id获取班级
    Class selectByPrimaryKey(Integer id);

    // 根据班级name获取班级
    Class selectByPrimaryName(String name);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}