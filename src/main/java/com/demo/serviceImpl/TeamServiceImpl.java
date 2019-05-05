package com.demo.serviceImpl;

import com.demo.entity.Team;
import com.demo.mapper.TeamMapper;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sch
 * @create 2019/5/4
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    // 根据团队id获取团队
    public Team getTeamById(int id) {
        return teamMapper.selectByPrimaryKey(id);
    }

    @Override
    // 根据团队name获取团队
    public Team getTeamByName(String name) {
        return teamMapper.selectByPrimaryName(name);
    }
}
