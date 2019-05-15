package com.demo.serviceImpl;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/5/4
 */
//业务逻辑实现层
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    // 根据学生id获取学生
    public Student getStudentById(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> getStudentListByName(String name) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public List<Student> selectClassAndStudent() {
        return null;
    }


}
