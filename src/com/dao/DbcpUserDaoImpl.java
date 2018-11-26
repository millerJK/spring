package com.dao;

import com.domain.User;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Primary
@Repository("dbcp_userDao")
public class DbcpUserDaoImpl implements UserDao {

    public DbcpUserDaoImpl() {
        System.out.println("DbcpUserDaoImpl init");
    }

    @Resource(name = "dbcp_jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean insertUser(String username, String password) {
        int update = jdbcTemplate.update("insert into user(username,userpwd) values(?,?)", username, password);
        return update > 0 ? true : false;
    }

    @Override
    public boolean deleteUser(String username) {
        int update = jdbcTemplate.update("delete from user where username = ?", username);
        return update > 0 ? true : false;
    }

    @Override
    public boolean updateUserPwd(String username, String password) {
        int update = jdbcTemplate.update("update user set userpwd = ? where username = ?", password, username);
        System.out.println("update = " + update);
        return update > 0 ? true : false;
    }

    @Override
    public boolean queryUsernameAndPassword(String username, String password) {
        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.username = (String) resultSet.getObject("username");
                user.userpwd = (String) resultSet.getObject("userpwd");
                return user;
            }
        };
        User user = jdbcTemplate.queryForObject("select * from user where username = ? and userpwd = ?", rowMapper, username, password);
        return user != null ? true : false;
    }

    @Override
    public User queryUseyByUserName(String username) {
        User user = jdbcTemplate.queryForObject("select * from user where username = ?", BeanPropertyRowMapper.newInstance(User.class), username);
        return user;
    }

    @Override
    public List<User> queryAllUsers() {
        List<User> users = jdbcTemplate.query("select * from user", BeanPropertyRowMapper.newInstance(User.class));
        System.out.println("users.toString() = " + users.toString());
        return users;
    }
}
