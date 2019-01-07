package com.reformer.wt_census.controller;

import com.reformer.wt_census.dao.MyDateTime;
import com.reformer.wt_census.model.*;
import com.reformer.wt_census.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("log")
    public String log() {
        return "index";
    }

    @RequestMapping("errors")
    public String errors() {
        return "errors";
    }

    @RequestMapping("tiaozhuanye")
    public String tiaozhuanye() {
        return "tiaozhuanye";
    }

    @RequestMapping("tablees")
    public String tablees(HttpSession session) throws Exception {
        List<User> userList = userService.userList();
        session.setAttribute("userList", userList);
        return "tablese";
    }


    @RequestMapping("welcome")
    public String login(User loginUser, HttpSession session) throws Exception {
        System.err.println(loginUser.getUsername());
        session.setAttribute("loUser", loginUser);
        if ((loginUser.getUsername()).equals("gaozhidong18")) {
            return "redirect:/tablees";
        }
        if (loginUser.getUsername() != null && !loginUser.getUsername().equals("")) {
            //增加数据到数据库
            loginUser.setU_time(MyDateTime.getTime());
            userService.addUsers(loginUser);
            return "tiaozhuanye";
        } else {
            String msg = "请输入姓名";
            session.setAttribute("msg", msg);
            return "index";
        }
    }
}
