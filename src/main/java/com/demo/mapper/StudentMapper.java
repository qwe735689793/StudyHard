package com.demo.mapper;

import com.demo.entity.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    //传入学生对象，增加学生
    int insertSelective(Student record);

    //根据学生id查询学生
    Student selectByPrimaryKey(Integer id);

    //根据学生name查询学生
    List<Student> selectByPrimaryName(String name);

    //查询所有学生
    List<Student> selectAllStudent();

    //传入学生对象，更新学生信息
    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}