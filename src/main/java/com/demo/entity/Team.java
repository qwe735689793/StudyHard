package com.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Team {
    private Integer id;

    private String code;

    private String name;

    private Integer teacherId;

    private Teacher teacher;

    private List<Student> studentList;
}