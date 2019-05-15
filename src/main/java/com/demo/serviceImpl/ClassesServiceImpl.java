package com.demo.serviceImpl;

import com.demo.mapper.ClassesMapper;
import com.demo.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sch
 * @create 2019/4/29
 */
@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public Class getClassById(int id) {
        return null;
    }

    @Override
    public Class getClassByName(String name) {
        return null;
    }

    @Override
    public List<Class> getClassListByTid(int tid) {
        return null;
    }
}
