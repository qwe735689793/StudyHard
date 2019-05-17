package com.demo.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Operation {
    private Integer id;

    private String name;

    private String content;

    private Date start;

    private Date end;

    private Integer status;

    private Integer teacherId;

    private Float score;

    private Teacher teacher;

    private List<Student> studentList;
}