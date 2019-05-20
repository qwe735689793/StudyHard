package com.demo.mapper;

import com.demo.entity.Course;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    /*查询所有课程*/
    List<Course> selectAllCourse();

    /*根据课程id查询教师id*/
    Integer selectTidByKey(Integer id);

    /*根据学生id查询学生所有的课程*/
    List<Course> selectCourseBySid(Integer Student_id);
}