package com.demo.controller;

import com.demo.entity.*;
import com.demo.entity.Class;
import com.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("getIndex")
    public String getUser(ModelMap map) {
        User user = userService.getUserById(1);
        Class aClass = classService.getClassByName("16软件工程");
        Teacher teacher = teacherService.getTeacherById(1);
        Team team = teamService.getTeamById(1);
        Task task = taskService.getTaskById(1);
        Student student=studentService.getStudentById(1);
        List<Student> stuList=studentService.getStudentListByName("student");
        List<Teacher> teaList=teacherService.getTeacherListByName("teacher");
        map.addAttribute("message",""+teaList.get(0).getTeacherId()+ teaList.get(1).getTeacherId());
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