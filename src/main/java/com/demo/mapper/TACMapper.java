package com.demo.mapper;

import com.demo.entity.TAC;

public interface TACMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAC record);

    int insertSelective(TAC record);

    TAC selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAC record);

    int updateByPrimaryKey(TAC record);
}