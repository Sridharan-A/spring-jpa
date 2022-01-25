package com.student.Exception;

import com.student.core.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;
import lombok.var;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import javax.persistence.EntityNotFoundException;
import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ExceptionTest {

    StudentService studentService;

    @Before
    public void setUp(){
        studentService=new StudentServiceImpl();
    }

    @Test
    public void testEntityNotFoundException(){
        assertThrows(EntityNotFoundException.class, ()->studentService.getOne(BigInteger.valueOf(45346543)));

    }
}

