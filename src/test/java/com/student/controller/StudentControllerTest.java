package com.student.controller;

import com.student.core.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Named;
import java.math.BigInteger;

@SpringBootTest
public class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Before
    public void setUp(){
        studentController = new StudentController();
    }

    @Test
    public void testStudentIdNotNull() throws Exception {
        Student one = studentController.getOne(1);
        System.out.println(one);
        Assert.assertNotNull(one);
    }

}
