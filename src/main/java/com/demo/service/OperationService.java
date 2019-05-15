package com.demo.service;

import com.demo.entity.Operation;

import java.util.List;

/*业务逻辑接口层*/
public interface OperationService {
    /*根据任务id获取任务*/
    Operation getOperationById(int id);

    /*增加一个任务*/
    int addOperation(Operation operation);

    /*查询所有任务*/
    List<Operation> getAllOperation();
}
