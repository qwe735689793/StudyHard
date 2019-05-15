package com.demo.serviceImpl;

import com.demo.entity.SAO;
import com.demo.mapper.SAOMapper;
import com.demo.service.SAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SAOServiceImpl implements SAOService {

    @Autowired
    private SAOMapper saoMapper;

    @Override
    public int addSAO(SAO sao) {
        return saoMapper.insertSelective(sao);
    }
}
