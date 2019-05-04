package com.demo.service;

import com.demo.entity.Student;

//业务逻辑接口层
public interface StudentService {
    // 根据学生id获取学生
    Student getStudentById(int id);
}
