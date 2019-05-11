package com.demo.mapper;

import com.demo.entity.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    // 根据团队id获取团队
    Team selectByPrimaryKey(Integer id);

    // 根据团队name获取团队
    Team selectByPrimaryName(String name);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}