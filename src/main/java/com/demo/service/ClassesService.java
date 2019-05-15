package com.demo.service;

import com.demo.entity.Classes;

import java.util.List;

/*业务逻辑接口层*/
public interface ClassesService {
    /*根据班级id获取班级*/
    Class getClassById(int id);

    /*根据班级name获取班级*/
    Class getClassByName(String name);

    /*根据教师id获取班级列表*/
    List<Class> getClassListByTid(int tid);

    /*增加一个学生*/
    int addClasses(Classes classes);
}
