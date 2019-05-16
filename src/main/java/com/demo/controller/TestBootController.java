package com.demo.controller;

import com.demo.entity.Course;
import com.demo.entity.Operation;
import com.demo.entity.Student;
import com.demo.entity.Team;
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
    private ClassesService classService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private OperationService operationService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private SACService sacService;
    @Autowired
    private SAOService saoService;
    @Autowired
    private TACService tacService;

    @RequestMapping("getIndex")
    public String getUser(ModelMap map) {
        List<Student> studentList = studentService.getAllStudent();
        List<Operation> operationList = operationService.getAllOperation();
        for (int i = 0; i < operationList.size(); i++) {
            System.out.println(operationList.get(i).getTeacher().getId());
            System.out.println(operationList.get(i).getTeacher().getCode());
            System.out.println(operationList.get(i).getTeacher().getName());
            System.out.println(operationList.get(i).getTeacher().getAccountId());
        }
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
        List<Course> courseList = courseService.getAllCourse();
        map.addAttribute("courseList", courseList);
        return "Mycourses";
    }

    @RequestMapping("getMyPanel")
    public String getMyPanel(ModelMap map) {
        List<Team> teamList = teamService.getAllTeam();
        List<Student> studentList = studentService.getAllStudent();
        map.addAttribute("teamList", teamList);
        map.addAttribute("studentList", studentList);
        return "MyPanel";
    }

    @RequestMapping("getGrouping")
    public String getGrouping(ModelMap map) {
        return "Grouping";
    }

    @RequestMapping("getMyTask")
    public String getMyTask(ModelMap map) {
        return "MyTask";
    }
}