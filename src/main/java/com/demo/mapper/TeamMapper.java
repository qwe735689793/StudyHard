package com.demo.mapper;

import com.demo.entity.Team;

import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    /*获取所有团队对象*/
    List<Team> selectAllTeam();
}