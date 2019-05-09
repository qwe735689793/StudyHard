package com.demo.mapper;

import com.demo.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    //传入教师对象，增加教师
    int insertSelective(Teacher record);

    //根据教师id获取教师
    Teacher selectByPrimaryKey(Integer id);

    //根据教师name获取所有教师
    List<Teacher> selectByPrimaryName(String name);

    //传入教师对象，更新教师信息
    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}