package com.demo.service;

import com.demo.entity.Student;

import java.util.List;

//业务逻辑接口层
public interface StudentService {
    // 根据学生id获取学生
    Student getStudentById(int id);

    //根据学生name查询所有学生
    List<Student> getStudentListByName(String name);
}
