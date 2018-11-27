package com.itszt.domain;

import org.springframework.context.annotation.Primary;

import java.security.PrivateKey;

/**
 * note:
 * 1.要保证属性名和前端parameter参数名一致，才能对属性就行赋值
 * 2.必须提供对用的get set 方法
 */
public class User {

    private String username;
    private String password;
    private Dog dog;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dog=" + dog +
                '}';
    }
}
