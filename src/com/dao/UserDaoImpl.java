package com.dao;

import org.springframework.stereotype.Repository;

@Repository("id_userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public boolean queryUsernameAndPassword(String username, String password) {
        System.out.println("c3p0 query username and password success");
        return true;
    }
}
