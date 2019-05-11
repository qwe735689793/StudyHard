package com.demo.mapper;

import com.demo.entity.Course;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    /*查询所有课程...啥也不传,就是这么任性*/
    List<Course> selectAllCourse();

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}