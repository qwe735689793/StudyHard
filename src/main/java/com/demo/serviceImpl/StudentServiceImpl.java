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
        return studentMapper.selectAllStudent();
    }

    @Override
    /*增加一个学生*/
    public int addStudent(Student student) {
        return studentMapper.insertSelective(student);
    }

    @Override
    /*更新一个学生*/
    public int updateStudent(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public String getNameById(Integer id) {
        return studentMapper.selectStudentNameById(id);
    }

    /*根据班级id查询团队*/
    public List<Student> findteam(Integer classes_id) {
        return studentMapper.findteam(classes_id);
    }

    /*根据班级id查询学生*/
    public List<Student> findStudent(Integer classes_id) {
        return studentMapper.findStudent(classes_id);
    }
}
