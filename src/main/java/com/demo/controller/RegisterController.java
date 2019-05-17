package com.demo.controller;

import com.demo.entity.Account;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author sch
 * @create 2019/4/12
 */
@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    /**
     * 新增注册用户
     */
    @PostMapping("/checkRegister")
    @ResponseBody
    public Object checkRegister(@RequestBody Map<String, Object> map) {
        Account newUser = new Account();
        newUser.setName(map.get("username").toString());
        newUser.setPassword(map.get("password").toString());
        System.out.println(newUser.getName() + ":" + newUser.getPassword());
        return newUser;
    }

    /**
     * 重复用户名验证
     */
    @RequestMapping("/checkUserName")
    @ResponseBody
    public String checkUserName(@RequestBody Map<String, Object> map) {
        String flag = "true";
        Account newUser = new Account();

        newUser.setName(map.get("username").toString());

        Account oldUser = userService.getUserByName(newUser.getName());
        if (oldUser != null) {
            flag = "false";
        }
        return flag;
    }
}