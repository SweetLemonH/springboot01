package com.edu.seiryo;

import com.edu.seiryo.entity.Pig;
import com.edu.seiryo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    Pig pig;
    @Autowired
    Student student;
    @Test
    void contextLoads() {
        System.out.println(pig);
        System.out.println(student);
    }

}
