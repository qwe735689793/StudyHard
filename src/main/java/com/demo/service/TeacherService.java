package com.demo.service;

import com.demo.entity.Teacher;


//业务逻辑接口层
public interface TeacherService {
    // 根据教师id获取教师
    Teacher getTeacherById(int id);

    // 根据教师name获取教师
    Teacher getTeacherByName(String name);

    // 增加一个教师
    int addTeacher(Teacher user);
}
