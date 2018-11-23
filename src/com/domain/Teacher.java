package com.domain;

import java.util.HashMap;
import java.util.Map;

public class Teacher {

    private String name;
    private int age;
    private String honor;

    public Teacher(String name, int age, String honor) {
        this.name = name;
        this.age = age;
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", honor='" + honor + '\'' +
                '}';
    }
}
