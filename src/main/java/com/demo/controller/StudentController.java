package com.demo.controller;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sch
 * @create 2019/5/17
 */
@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 跳转到学生详情页面
     */
    @RequestMapping("/getPslInformation")
    public String getPslInformation(ModelMap map, HttpServletRequest request) {
        Student student = (Student) request.getSession().getAttribute("user");
        map.addAttribute("student", student);
        return "PslInformation";
    }
}
