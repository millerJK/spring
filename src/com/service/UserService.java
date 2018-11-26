package com.service;

import com.domain.User;

import java.util.List;

public interface UserService {

    boolean login(String username, String password);

    boolean unregister(String username);

    boolean changePassword(String username, String password);

    List<User> getAllUser();
}
