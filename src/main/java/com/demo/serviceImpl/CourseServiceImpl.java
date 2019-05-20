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
    /*根据课程id获取课程*/
    public Course getCourseById(int id) {
        return null;
    }

    @Override
    /*查询所有课程*/
    public List<Course> getAllCourse() {
        return courseMapper.selectAllCourse();
    }

    @Override
    /*增加一个课程*/
    public int addCourse(Course course) {
        return courseMapper.insertSelective(course);
    }

    @Override
    /*更新一个课程*/
    public int updateCourse(Course course) {
        return courseMapper.updateByPrimaryKeySelective(course);
    }

    @Override
    /*根据课程id查询教师id*/
    public Integer getTidById(Integer course_id) {
        return courseMapper.selectTidByKey(course_id);
    }

    @Override
    /*根据学生id查询学生所有的课程*/
    public List<Course> findCourseBySid(Integer Student_id) {
        return courseMapper.selectCourseBySid(Student_id);
    }
}
