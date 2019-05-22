package com.demo.service;

import com.demo.entity.Student;

import java.util.List;

/*业务逻辑接口层*/
public interface StudentService {
    /*根据学生id获取学生*/
    Student getStudentById(int id);

    /*根据学生name查询所有学生*/
    List<Student> getStudentListByName(String name);

    /*查询所有学生*/
    List<Student> getAllStudent();

    /*增加一个学生*/
    int addStudent(Student student);

    /*更新一个学生*/
    int updateStudent(Student student);

    /*根据学生id查询学生姓名*/
    String getNameById(Integer id);

    /*根据班级id查询团队*/
    List<Student> findteam(Integer classes_id);

    /*根据班级id查询学生*/
    List<Student> findStudent(Integer classes_id);

}
