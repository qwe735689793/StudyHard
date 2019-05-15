package com.demo.mapper;

import com.demo.entity.Operation;

import java.util.List;

public interface OperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Operation record);

    int insertSelective(Operation record);

    Operation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);

    /*查询所有任务*/
    List<Operation> selectAllOperation();
}