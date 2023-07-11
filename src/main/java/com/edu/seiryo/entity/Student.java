package com.edu.seiryo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private String name;
    private Integer age;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Pig pig;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Pig getPig() {
        return pig;
    }

    public void setPig(Pig pig) {
        this.pig = pig;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", pig=" + pig +
                '}';
    }

    public Student(String name, Integer age, Date birthday, Map<String, Object> maps, List<Object> lists, Pig pig) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.maps = maps;
        this.lists = lists;
        this.pig = pig;
    }

    public Student() {
    }
}
