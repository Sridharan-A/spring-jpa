package com.student.service;

import com.student.core.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Collection;

public interface StudentService {
    Student getOne(int id);

    Student getOne(String name);

    Collection<Student> getAll();

    Collection<Student> getStudentsByDepartment(String dept);

    Student addStudent(@RequestBody Student student);

    void removeStudent(int id);

    public Student updateStudent(Student student,int id);

    public Student updateStudentName(int id, String name);
}
