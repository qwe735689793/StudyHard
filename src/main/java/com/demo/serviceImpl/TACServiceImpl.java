package com.demo.serviceImpl;

import com.demo.entity.TAC;
import com.demo.mapper.TACMapper;
import com.demo.service.TACService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TACServiceImpl implements TACService {
    @Autowired
    private TACMapper tacMapper;

    public int addTAC(TAC tac) {
        return tacMapper.insertSelective(tac);
    }
}
