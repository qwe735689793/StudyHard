package com.demo.controller;

import com.demo.entity.Class;
import com.demo.entity.User;
import com.demo.service.ClassService;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sch
 * @create 2019/3/29
 * 这是一个测试类！这是一个测试类！这是一个测试类
 */
@Controller
public class TestBootController {
    @Autowired
    private UserService userService;
    @Autowired
    private ClassService classService;

    @RequestMapping("getUser")
    public String getUser(ModelMap map) {
        User user = userService.getUserById(1);
        Class aClass =classService.getClassByName("16软件工程");
        map.addAttribute("message", aClass.getName());
        return "index";
    }

    @RequestMapping("getLogin")
    public String getLogin(ModelMap map) {
        return "Login";
    }

    @RequestMapping("getRegister")
    public String getRegister(ModelMap map) {
        return "Register";
    }

    @RequestMapping("getHome")
    public String getHome(ModelMap map) {
        return "Home";
    }

    @RequestMapping("getcrud")
    public String getcrud(ModelMap map) {
        return "crud";
    }

    @RequestMapping("getcurriculum")
    public String getcurriculum(ModelMap map) {
        return "Curriculum";
    }

    @RequestMapping("getStudent_Home")
    public String getStudent_Home(ModelMap map) {
        return "Student_Home";
    }

    @RequestMapping("getPslInformation")
    public String getPslInformation(ModelMap map) {
        return "PslInformation";
    }

    @RequestMapping("getMycourses")
    public String getMycourses(ModelMap map) {
        return "Mycourses";
    }

    @RequestMapping("getMyPanel")
    public String getMypanel(ModelMap map) {
        return "MyPanel";
    }

    @RequestMapping("getGrouping")
    public String getGrouping(ModelMap map) {
        return "Grouping";
    }
}