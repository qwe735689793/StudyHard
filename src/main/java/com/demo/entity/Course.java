package com.demo.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Course {
    private Integer id;

    private String code;

    private String name;

    private Date start;

    private Date end;

    private Integer teacherId;

    private Teacher teacher;

    private List<Student> studentList;
}