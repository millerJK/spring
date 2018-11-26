package com;

import com.domain.User;
import com.service.UserService;
import com.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring-config.xml");
        UserService userService = context.getBean("id_userService", UserServiceImpl.class);

//        boolean login = userService.login("xiaomi", "pass");
//        System.out.println("login = " + login);
//
//        boolean unreigister = userService.unregister("xiaomi");
//        System.out.println("unreigister = " + unreigister);
//
//        boolean b = userService.changePassword("王宁", "xia");
//        System.out.println("changePassword = " + b);

        List<User> allUser = userService.getAllUser();

        //@Lazy 获取单例
//        UserService userService1 = context.getBean("id_userService", UserServiceImpl.class);
//        System.out.println("userService1 = " + userService1);
    }
}
