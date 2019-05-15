package com.demo.controller.dataController;

import com.demo.entity.Account;
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
public class LoginDataController {
    @Autowired
    private UserService userService;

    /**
     * 登录账户验证
     */
    @RequestMapping("/checkLogin")
    @ResponseBody
    public String checkLogin(@RequestBody Map<String, Object> map) {
        String flag = "false";
        Account newUser = new Account();
        newUser.setName(map.get("username").toString());
        newUser.setPassword(map.get("password").toString());
//        System.out.println(newUser.getName() + ":" + newUser.getPassword());

        Account oldUser = userService.getUserByName(newUser.getName());

        if (oldUser != null) {
            if (oldUser.getName().equals(newUser.getName()) && oldUser.getPassword().equals(newUser.getPassword())) {
                flag = "true";
            }
        }
        return flag;
    }
}
