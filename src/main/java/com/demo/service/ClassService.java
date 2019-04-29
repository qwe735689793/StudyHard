package com.demo.service;

import com.demo.entity.Class;

import java.util.List;

//业务逻辑接口层
public interface ClassService {
    // 根据班级id获取班级
    Class getClassById(int id);

    // 根据班级name获取班级
    Class getClassByName(String name);

    // 根据教师id获取班级列表
    List<Class> getClassListByTid(int tid);
}
