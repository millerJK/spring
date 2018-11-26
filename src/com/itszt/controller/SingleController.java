package com.itszt.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Map;

/**
 * 实现web层的mvc
 * <p>
 * m: 实际处理业务的servlet
 * <p>
 * v: html jsp 页面
 * <p>
 * c:就是以前我们的xxxCenterServlet
 */
public class SingleController implements Controller {

    public SingleController() {
        System.out.println("SingleController init");
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data1", "data1Value1"); //setAttribute
        modelAndView.addObject("data2", "dataValue2"); //setAttribute


        modelAndView.addObject("dataValue3");
        ArrayList<String> datas = new ArrayList<>();
        datas.add("1");
        modelAndView.addObject(datas); //如上这个两个例子也可以看出key的生成规律


        Map<String, Object> model = modelAndView.getModel();
        System.out.println("model.toString() = " + model.toString());

        modelAndView.setViewName("result.jsp"); //设置我们的返回目标
        return modelAndView;
    }
}
