package com.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private Integer id;

    private String code;

    private String name;

    private Integer accountId;

    private Course course;

    private List<Team> teamList;

    private List<Classes> classesList;
}