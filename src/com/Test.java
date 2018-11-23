package com;

import com.service.UserService;
import com.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring-config.xml");
        UserService userService = context.getBean("id_userService", UserServiceImpl.class);
        System.out.println("userService = " + userService);
        boolean login = userService.login("xiaomi", "pass");
        System.out.println("currentThread =  " + Thread.currentThread());
        System.out.println("login = " + login);

        //@Lazy 获取单例
//        UserService userService1 = context.getBean("id_userService", UserServiceImpl.class);
//        System.out.println("userService1 = " + userService1);
    }
}
