package com.demo.serviceImpl;

import com.demo.entity.Course;
import com.demo.mapper.CourseMapper;
import com.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/5/11
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    // 根据课程id获取课程
    public Course getCourseById(int id) {
        return null;
    }

    @Override
    // 查询所有课程
    public List<Course> getAllCourse() {
        return courseMapper.selectAllCourse();
    }
}
