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

    /*根据学生id查询学生姓名*/
    String selectStudentNameById(Integer id);

    /*根据班级id查询团队*/
    List<Student> findteam(Integer classes_id);

    /*根据课程id查询学生*/
    List<Student> findStudent(Integer classes_id);
}