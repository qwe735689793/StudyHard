package com.demo.serviceImpl;

import com.demo.entity.Operation;
import com.demo.mapper.OperationMapper;
import com.demo.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/5/4
 */
@Service
public class OperationServiceImpl implements OperationService {
    @Autowired
    private OperationMapper operationMapper;

    @Override
    // 根据任务id获取任务
    public Operation getOperationById(int id) {
        return operationMapper.selectByPrimaryKey(id);
    }

    @Override
    /*增加一个任务*/
    public int addOperation(Operation operation) {
        return operationMapper.insertSelective(operation);
    }

    @Override
    /*查询所有任务*/
    public List<Operation> getAllOperation() {
        return operationMapper.selectAllOperation();
    }
}
