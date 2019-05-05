package com.demo.mapper;

import com.demo.entity.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Task record);

    int insertSelective(Task record);
    // 根据任务id获取任务
    Task selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}