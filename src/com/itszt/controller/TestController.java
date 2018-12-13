package com.itszt.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Lazy
@RequestMapping("/UserCenter")
public class TestController {

    public TestController() {
        System.out.println("TestController init ！");
    }

    @RequestMapping("testAdd")
    public String add() {
        System.out.println("TestController add ! ");
        //默认是转发
        return "result";
    }

    @RequestMapping("testDel")
    public String delete() {
        return "result";
    }


    @RequestMapping("testUpdate")
    public String update() {
        return "result";
    }

    @RequestMapping("testQuery")
    public String query() {
        //
        return "result";
    }
}
