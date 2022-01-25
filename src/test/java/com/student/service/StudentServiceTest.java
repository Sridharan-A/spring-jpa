package com.student.service;

import com.student.core.Student;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;


    @Before
    public void setUp(){
        studentService=new StudentServiceImpl();
    }

    @Test
    public void testGetOne(){
        Student s1=studentService.getOne(BigInteger.valueOf(1));
        assertNotNull(s1);
    }

    @Test
    public void testGetAnotherOne(){
        Student s2=studentService.getOne(BigInteger.valueOf(2));
        assertNotNull(s2);
    }

    @Test
    public void testAll(){
        assertNotNull(studentService.getAll());
        studentService.getAll().stream().forEach(a->assertNotNull(a));
    }
    @Test
    public void testStudentGetByDepartment(){
        String dept="Zoology";
        Collection<Student> studentsByDepartment = studentService.getStudentsByDepartment(dept);
        System.out.println(studentsByDepartment);
        studentsByDepartment.stream().forEach(a->assertEquals(dept,a.getDept()));
    }

    @Test
    public void testUpdateStudentName(){
        BigInteger id= BigInteger.valueOf(1);
        String name="sridhar";
        studentService.updateStudentName(id,name);
        assertEquals(name,studentService.getOne(id).getName());
    }



}
