package com.itszt.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 这个东西有什么作用吗？
 */
public class MulController extends MultiActionController {


    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data1", "value");
        modelAndView.addObject("data2", "增");
        modelAndView.setViewName("result.jsp");
        return modelAndView;
    }


    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data1", "value");
        modelAndView.addObject("data2", "删");
        modelAndView.setViewName("result.jsp");
        return modelAndView;
    }


    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data1", "value");
        modelAndView.addObject("data2", "改");
        modelAndView.setViewName("result.jsp");
        return modelAndView;
    }


    public ModelAndView query(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data1", "value");
        modelAndView.addObject("data2", "查");
        modelAndView.setViewName("result.jsp");
        return modelAndView;
    }


}
