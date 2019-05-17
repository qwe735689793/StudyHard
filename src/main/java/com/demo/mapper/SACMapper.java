package com.demo.mapper;

import com.demo.entity.SAC;

import java.util.List;

public interface SACMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SAC record);

    int insertSelective(SAC record);

    SAC selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SAC record);

    int updateByPrimaryKey(SAC record);

    /*查询所有学生和课程*/
    List<SAC> selectAll();

    /*根据课程id查询并按成绩排名*/
    List<SAC> selectAllOrderByScore(Integer course_id);
}