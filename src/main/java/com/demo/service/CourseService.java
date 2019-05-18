package com.demo.service;

import com.demo.entity.Course;

import java.util.List;

/*业务逻辑接口层*/
public interface CourseService {
    /*根据课程id获取课程*/
    Course getCourseById(int id);

    /*查询所有课程*/
    List<Course> getAllCourse();

    /*增加一个课程*/
    int addCourse(Course course);

    /*更新一个课程*/
    int updateCourse(Course course);

    /*根据课程id查询教师id*/
    Integer getTidById(Integer course_id);
}
