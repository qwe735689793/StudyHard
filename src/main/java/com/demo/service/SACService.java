package com.demo.service;

import com.demo.entity.SAC;
import com.demo.entity.Score;

import java.util.List;

public interface SACService {
    int addSAC(SAC sac);

    /*查询所有数据*/
    List<SAC> findAll();

    /*更新一个SAC*/
    void updateOneSAC(SAC sac);

    /*根据课程id查询团队成绩并按成绩排名*/
    List<Score> findTeamScoreByCid(Integer course_id);

    /*根据课程id查询学生成绩并按成绩排名*/
    List<Score> findStudentScoreByCid(Integer course_id);
}
