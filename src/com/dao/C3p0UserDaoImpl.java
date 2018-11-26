package com.dao;

import com.domain.User;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository("c3p0_userDao")
public class C3p0UserDaoImpl implements UserDao {

    @Resource(name = "c3p0_jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean insertUser(String username, String password) {
        return false;
    }

    @Override
    public boolean deleteUser(String username) {
        return false;
    }

    @Override
    public boolean updateUserPwd(String username, String password) {
        return false;
    }

    @Override
    public boolean queryUsernameAndPassword(String username, String password) {
        System.out.println("c3p0 query username and password success"+(jdbcTemplate == null));
        return true;
    }

    @Override
    public User queryUseyByUserName(String username) {
        return null;
    }

    @Override
    public List<User> queryAllUsers() {

        return null;
    }
}
