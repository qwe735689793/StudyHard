package com.demo.controller;

import com.demo.entity.Course;
import com.demo.entity.Score;
import com.demo.service.SACService;
import com.demo.service.StudentService;
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
    private StudentService studentService;
    @Autowired
    private SACService sacService;

    /**
     * 跳转到我的面板页面
     */
    @RequestMapping("/getMyPanel")
    public String getMyPanel(ModelMap map) {
        Integer course_id = 1;
        Integer Student_id = 22;
        /*根据课程id查询学生成绩并按成绩排名*/
        List<Score> stuList = sacService.findStudentScoreByCid(course_id);

        /*根据课程id查询团队成绩并按成绩排名*/
        List<Score> teamList = sacService.findTeamScoreByCid(course_id);
        List<Course> coursesList = sacService.findStudentCourse(Student_id);
        map.addAttribute("teamList", teamList);
        map.addAttribute("stuList", stuList);
        map.addAttribute("courseList", coursesList);
        return "MyPanel";
    }
}
