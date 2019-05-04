package com.demo.service;


import com.demo.entity.Team;

//业务逻辑接口层
public interface TeamService {
    // 根据团队id获取团队
    Team getTeacherById(int id);
}
