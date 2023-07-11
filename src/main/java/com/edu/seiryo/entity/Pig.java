package com.edu.seiryo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pig {
    @Value("莎莎")
    private  String name;
    @Value("6")
    private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Pig(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pig() {
    }
}
