package com.demo.serviceImpl;

import com.demo.entity.Class;
import com.demo.mapper.ClassMapper;
import com.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/4/29
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    // 根据班级id获取班级
    public Class getClassById(int classId) {
        return classMapper.selectByPrimaryKey(classId);
    }

    @Override
    // 根据班级name获取班级
    public Class getClassByName(String name) {
        return classMapper.selectByPrimaryName(name);
    }

    @Override
    // 根据教师id获取班级列表
    public List<Class> getClassListByTid(int classTid) {
        return null;
    }
}
