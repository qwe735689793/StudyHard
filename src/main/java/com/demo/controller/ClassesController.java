package com.demo.controller;

import com.demo.entity.Course;
import com.demo.entity.Score;
import com.demo.entity.Student;
import com.demo.service.CourseService;
import com.demo.service.SACService;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
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
    @Autowired
    private CourseService courseService;
    @Autowired
    private HttpSession session;

    /**
     * 跳转到我的面板页面
     */
    @RequestMapping("/getMyPanel")
    public String getMyPanel(ModelMap map,
                             @RequestParam(defaultValue = "-1", value = "course_id") String cid) {
        Student student = (Student) session.getAttribute("user");
        Integer Student_id = student.getId();
        Integer course_id;
        course_id = Integer.parseInt(cid);
        if (course_id < 0) {
            course_id = 1;
        }
        System.out.println(course_id);
        /*根据课程id查询学生成绩并按成绩排名*/
        List<Score> stuList = sacService.findStudentScoreByCid(course_id);

        /*根据课程id查询团队成绩并按成绩排名*/
        List<Score> teamList = sacService.findTeamScoreByCid(course_id);

        /*根据学生id查询学生所有的课程*/
        List<Course> coursesList = courseService.findCourseBySid(Student_id);

        map.addAttribute("teamList", teamList);
        map.addAttribute("stuList", stuList);
        map.addAttribute("courseList", coursesList);
        return "MyPanel";
    }
}
