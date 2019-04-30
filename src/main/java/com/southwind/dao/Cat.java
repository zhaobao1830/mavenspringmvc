package com.southwind.dao;

public class Cat {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
