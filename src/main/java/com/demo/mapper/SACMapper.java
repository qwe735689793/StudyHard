package com.demo.mapper;

import com.demo.entity.SAC;
import com.demo.entity.Score;

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

    /*根据课程id查询团队成绩并按成绩排名*/
    List<Score> selectTeamScoreByCid(Integer course_id);

    /*根据课程id查询学生成绩并按成绩排名*/
    List<Score> selectStudentScoreByCid(Integer course_id);
}