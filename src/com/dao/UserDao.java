package com.dao;

import com.domain.User;

import java.util.List;

public interface UserDao {

    boolean insertUser(String username, String password);

    boolean deleteUser(String username);

    boolean updateUserPwd(String username, String password);

    boolean queryUsernameAndPassword(String username, String password);

    User queryUseyByUserName(String username);

    List<User> queryAllUsers();
}
