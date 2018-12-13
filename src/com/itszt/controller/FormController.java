package com.itszt.controller;

import com.itszt.domain.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Lazy
public class FormController {

    @RequestMapping("/formDeal")
    public String form(HttpServletRequest request) {
        System.out.println("request = " + request.getParameter("username"));
        return "result";
    }

    /**
     * @param password 参数名需要和parameter 名一样
     * @param username 参数名需要和parameter 一致，才能将传递过来的parameter值赋值。
     * @return
     */
    @RequestMapping("/formDeal1")
    public String formDel(String password, String username) {
        System.out.println("username +\"   \"+password = " + username + "   " + password);
        return "result";
    }


    @RequestMapping("/formDeal5")
    public String formDel5(@RequestParam(name = "username",required = false) String name) {
        System.out.println("username +\"   \"+password = " + name + "   " + name);
        return "result";
    }


    @RequestMapping("/formDeal2")
    public String formUpdate(User user, HttpServletRequest request) {
        System.out.println("user.toString() = " + user.toString());
        request.setAttribute("user", user);
        return "result";
    }

    /*
      存放到session
     */
    @RequestMapping("/formDeal3")
    public String formSession(User user, HttpSession session) {
        session.setAttribute("user", user);
        return "result";
    }


}
