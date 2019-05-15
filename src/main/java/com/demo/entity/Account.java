package com.demo.entity;

import lombok.Data;

@Data
public class Account {
    private Integer id;

    private String name;

    private String password;

    private Integer status;

}