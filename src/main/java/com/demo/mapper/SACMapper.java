package com.demo.mapper;

import com.demo.entity.SAC;

public interface SACMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SAC record);

    int insertSelective(SAC record);

    SAC selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SAC record);

    int updateByPrimaryKey(SAC record);
}