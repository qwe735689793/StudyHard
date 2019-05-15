package com.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private Integer id;

    private String code;

    private String name;

    private Integer teamId;

    private Integer classesId;

    private Integer accountId;

    private Classes classes;

    private Team team;

    private Account account;

    private List<Course> courseList;

    private List<Operation> operationList;
}