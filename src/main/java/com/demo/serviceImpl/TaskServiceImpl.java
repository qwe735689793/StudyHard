package com.demo.serviceImpl;

import com.demo.entity.Task;
import com.demo.mapper.TaskMapper;
import com.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sch
 * @create 2019/5/4
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskMapper taskMapper;

    @Override
    // 根据任务id获取任务
    public Task getTaskById(int id) {
        return taskMapper.selectByPrimaryKey(id);
    }
}
