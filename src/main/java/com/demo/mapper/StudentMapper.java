package com.demo.mapper;

import com.demo.entity.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    /*获取所有学生对象*/
    List<Student> selectAllStudent();

    /*更新一个学生*/
    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}