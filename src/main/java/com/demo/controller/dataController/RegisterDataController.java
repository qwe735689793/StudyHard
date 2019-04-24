package com.demo.controller.dataController;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author sch
 * @create 2019/4/12
 */
@Controller
public class RegisterDataController {
    @Autowired
    private UserService userService;

    /**
     * 新增注册用户
     */
    @RequestMapping("/checkRegister")
    @ResponseBody
    public Object checkRegister(@RequestBody Map<String, Object> map) {
        User newUser = new User();
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
        User newUser = new User();

        newUser.setName(map.get("username").toString());

        User oldUser = userService.getUserByName(newUser.getName());
        if (oldUser != null) {
            flag = "false";
        }
        return flag;
    }
}
