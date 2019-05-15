package com.demo.serviceImpl;

import com.demo.entity.SAC;
import com.demo.mapper.SACMapper;
import com.demo.service.SACService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SACServiceImpl implements SACService {

    @Autowired
    private SACMapper sacMapper;

    @Override
    public int addSAC(SAC sac) {
        return sacMapper.insertSelective(sac);
    }
}
