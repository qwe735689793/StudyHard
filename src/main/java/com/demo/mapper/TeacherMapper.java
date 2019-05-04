package com.demo.mapper;

import com.demo.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    // 根据教师id获取教师
    Teacher selectByPrimaryKey(Integer id);

    // 根据教师name获取教师
    Teacher selectByPrimaryName(String name);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}