package com.demo.controller;

import com.demo.entity.Student;
import com.demo.entity.Team;
import com.demo.service.StudentService;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author sch
 * @create 2019/5/17
 */
@Controller
@RequestMapping("/")
public class ClassesController {
    @Autowired
    private TeamService teamService;
    @Autowired
    private StudentService studentService;

    /**
     * 跳转到我的面板页面
     */
    @RequestMapping("/getMyPanel")
    public String getMyPanel(ModelMap map) {
        List<Team> teamList = teamService.getAllTeam();
        List<Student> studentList = studentService.getAllStudent();
        map.addAttribute("teamList", teamList);
        map.addAttribute("studentList", studentList);
        return "MyPanel";
    }
}
