package com.southwind.dao;

public class Animal1 {
    private int age;
    private String name;

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

    @Override
    public String toString() {
        return "Animal1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
