package com.service;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;


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
    public boolean login(String username, String password) {
        //dao层查询数据
        boolean b = userDao.insertUser(username, password);
        return b;
    }

    @Override
    public boolean unregister(String username) {
        return userDao.deleteUser(username);
    }

    @Override
    public boolean changePassword(String username, String password) {
        return userDao.updateUserPwd(username, password);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.queryAllUsers();
    }
}
