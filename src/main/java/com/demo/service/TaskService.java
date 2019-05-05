package com.demo.service;

import com.demo.entity.Task;
import com.demo.entity.Teacher;

//业务逻辑接口层
public interface TaskService {
    // 根据任务id获取任务
    Task getTaskById(int id);
}
