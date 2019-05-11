package com.demo.mapper;

import com.demo.entity.Team;

import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    // 根据团队id获取团队
    Team selectByPrimaryKey(Integer id);

    // 根据团队name获取团队
    Team selectByPrimaryName(String name);

    // 查询所有团队
    List<Team> selectAllTeam();

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}