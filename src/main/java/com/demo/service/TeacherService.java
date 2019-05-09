package com.demo.service;

import com.demo.entity.Teacher;

import java.util.List;


//业务逻辑接口层
public interface TeacherService {
    //根据教师id获取教师
    Teacher getTeacherById(int id);

    //根据教师name获取所有教师
    List<Teacher> getTeacherListByName(String name);

    //传入教师对象，增加教师
    int addTeacher(Teacher user);
}
