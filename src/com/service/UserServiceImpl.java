package com.service;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service("id_userService")
@Lazy
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl init");
    }

    @Override
    @Async
    public boolean login(String username, String password) {
        //dao层查询数据
        System.out.println("调用dao层查询用户名和密码   " + Thread.currentThread());
        boolean b = userDao.queryUsernameAndPassword(username, password);
        return b;
    }
}
