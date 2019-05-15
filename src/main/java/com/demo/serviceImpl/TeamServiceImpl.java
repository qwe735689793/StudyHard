package com.demo.serviceImpl;

import com.demo.entity.Team;
import com.demo.mapper.TeamMapper;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/5/4
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public Team getTeamById(int id) {
        return null;
    }

    @Override
    public Team getTeamByName(String name) {
        return null;
    }

    @Override
    /*查询所有团队*/
    public List<Team> getAllTeam() {
        return teamMapper.selectAllTeam();
    }

    @Override
    /*增加一个团队*/
    public int addTeam(Team team) {
        return teamMapper.insertSelective(team);
    }
}
