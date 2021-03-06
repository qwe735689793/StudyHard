package com.demo.serviceImpl;

import com.demo.entity.Teacher;
import com.demo.mapper.TeacherMapper;
import com.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/5/4
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    /*根据教师id获取教师*/
    public Teacher getTeacherById(int id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Teacher> getTeacherListByName(String name) {
        return null;
    }

    @Override
    /*增加教师*/
    public int addTeacher(Teacher teacher) {
        return teacherMapper.insertSelective(teacher);
    }

    @Override
    /*获取所有教师对象*/
    public List<Teacher> getAllTeacher() {
        return teacherMapper.selectAllTeacher();
    }
}
