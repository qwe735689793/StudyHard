package com.demo.mapper;

import com.demo.entity.SAO;

public interface SAOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SAO record);

    int insertSelective(SAO record);

    SAO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SAO record);

    int updateByPrimaryKey(SAO record);
}