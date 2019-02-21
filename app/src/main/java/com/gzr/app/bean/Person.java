package com.gzr.app.bean;


import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 10001L;
    /**
     * name : zhangsan
     * age : 29
     * sex : man
     */

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
