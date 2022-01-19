package com.student.service;

import com.student.core.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Collection;

public interface StudentService {
    Student getOne(BigInteger id);

    Collection<Student> getAll();

    Collection<Student> getStudentsByDepartment(String dept);

    Student addStudent(@RequestBody Student student);

    void removeStudent(BigInteger id);

    public Student updateStudent(Student student,BigInteger id);

    public Student updateStudentName(BigInteger id, String name);
}
