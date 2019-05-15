package com.demo.service;


import com.demo.entity.Team;

import java.util.List;

/*业务逻辑接口层*/
public interface TeamService {
    /*根据团队id获取团队*/
    Team getTeamById(int id);

    /*根据团队name获取团队*/
    Team getTeamByName(String name);

    /*查询所有团队*/
    List<Team> getAllTeam();

    /*增加一个团队*/
    int addTeam(Team team);
}
