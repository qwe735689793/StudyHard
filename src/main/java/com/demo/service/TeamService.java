package com.demo.service;


import com.demo.entity.Team;

//业务逻辑接口层
public interface TeamService {
    // 根据团队id获取团队
    Team getTeamById(int id);

    // 根据团队name获取团队
    Team getTeamByName(String name);
}
