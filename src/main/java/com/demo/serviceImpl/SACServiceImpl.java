package com.demo.serviceImpl;

import com.demo.entity.SAC;
import com.demo.entity.Score;
import com.demo.mapper.SACMapper;
import com.demo.service.SACService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SACServiceImpl implements SACService {

    @Autowired
    private SACMapper sacMapper;

    @Override
    public int addSAC(SAC sac) {
        return sacMapper.insertSelective(sac);
    }

    @Override
    /*查询所有数据*/
    public List<SAC> findAll() {
        return sacMapper.selectAll();
    }

    @Override
    /*更新一个SAC*/
    public void updateOneSAC(SAC sac) {
        sacMapper.updateByPrimaryKeySelective(sac);
    }

    @Override
    /*根据课程id查询团队成绩并按成绩排名*/
    public List<Score> findTeamScoreByCid(Integer course_id) {
        return sacMapper.selectTeamScoreByCid(course_id);
    }

    @Override
    /*根据课程id查询学生成绩并按成绩排名*/
    public List<Score> findStudentScoreByCid(Integer course_id) {
        return sacMapper.selectStudentScoreByCid(course_id);
    }

}
