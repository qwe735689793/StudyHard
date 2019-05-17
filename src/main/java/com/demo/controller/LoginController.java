package com.demo.controller;

import com.demo.entity.Account;
import com.demo.entity.Student;
import com.demo.entity.Teacher;
import com.demo.service.StudentService;
import com.demo.service.TeacherService;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author sch
 * @create 2019/4/12
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpSession session;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    /**
     * 登录账户验证
     */
    @RequestMapping("/checkLogin")
    @ResponseBody
    public String checkLogin(@RequestBody Map<String, Object> map) {
        String flag = "/getLogin";
        Account newUser = new Account();
        newUser.setName(map.get("username").toString());
        newUser.setPassword(map.get("password").toString());

        Account oldUser = userService.getUserByName(newUser.getName());

        if (oldUser != null) {
            if (oldUser.getName().equals(newUser.getName()) && oldUser.getPassword().equals(newUser.getPassword())) {
                Integer account_id = oldUser.getId();
                Student student = studentService.getStudentById(account_id);
                if (student != null) {
                    session.setAttribute("user", student);
                    session.setAttribute("username", student.getName());
                } else {
                    Teacher teacher = teacherService.getTeacherById(account_id);
                    session.setAttribute("user", teacher);
                    session.setAttribute("username", teacher.getName());
                }

                flag = "/getStudent_Home";
            }
        }
        return flag;
    }
}
