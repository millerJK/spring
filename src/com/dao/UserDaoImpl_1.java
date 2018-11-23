package com.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Primary
@Repository("id_userDao_1")
public class UserDaoImpl_1 implements UserDao {
    @Override
    public boolean queryUsernameAndPassword(String username, String password) {
        System.out.println("dbcp query username and password success");
        return true;
    }
}
