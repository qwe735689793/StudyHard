package com.demo.service;

import com.demo.entity.SAC;

import java.util.List;

public interface SACService {
    int addSAC(SAC sac);

    /*查询所有数据*/
    List<SAC> findAll();

    /*更新一个SAC*/
    void updateOneSAC(SAC sac);
}
