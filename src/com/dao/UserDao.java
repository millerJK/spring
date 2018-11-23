package com.dao;

public interface UserDao {
    boolean queryUsernameAndPassword(String username, String password);
}
