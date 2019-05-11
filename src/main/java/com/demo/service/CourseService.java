package com.demo.service;

import com.demo.entity.Course;

import java.util.List;

//业务逻辑接口层
public interface CourseService {
    // 根据课程id获取课程
    Course getCourseById(int id);

    // 查询所有课程
    List<Course> getAllCourse();
}
