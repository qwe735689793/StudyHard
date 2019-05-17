package com.demo.controller;

import com.demo.entity.SAC;
import com.demo.entity.Score;
import com.demo.entity.Team;
import com.demo.service.SACService;
import com.demo.service.StudentService;
import com.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
    @Autowired
    private SACService sacService;

    /**
     * 跳转到我的面板页面
     */
    @RequestMapping("/getMyPanel")
    public String getMyPanel(ModelMap map) {
        List<Team> teamList = teamService.getAllTeam();

        List<SAC> sacList = sacService.findAllOrderByScore(1);
        /*个人成绩排名*/
        ArrayList<Score> stuList = new ArrayList<>();
        for (int i = 0; i < sacList.size(); i++) {
            Score score = new Score();
            SAC sac = sacList.get(i);
            Integer sid = sac.getStudentId();
            String name = studentService.getNameById(sid);
            score.setId(sid);
            score.setScore(sac.getScore());
            score.setName(name);
            stuList.add(score);
        }
        /*团队成绩排名*/
        /*        ArrayList<Score> teamList = new ArrayList<>();*/

        map.addAttribute("teamList", teamList);
        map.addAttribute("stuList", stuList);
        return "MyPanel";
    }
}
