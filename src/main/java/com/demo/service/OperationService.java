package com.demo.service;

import com.demo.entity.Operation;

//业务逻辑接口层
public interface OperationService {
    // 根据任务id获取任务
    Operation getOperationById(int id);
}
