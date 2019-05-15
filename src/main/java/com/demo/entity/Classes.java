package com.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classes {
    private Integer id;

    private String code;

    private String name;

    private List<Student> studentList;

    private List<Teacher> teacherList;
}