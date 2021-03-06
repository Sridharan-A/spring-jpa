package com.student.service;

import com.student.core.Student;
import com.student.exception.GlobalExceptionHandler;
import com.student.exception.InvalidInputException;
import com.student.repository.StudentRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityNotFoundException;
import java.math.BigInteger;
import java.util.Collection;

@Named
public class StudentServiceImpl implements StudentService{
    @Inject
    StudentRepository studentRepository;


    @Override
    public Student getOne(int id) {
        System.out.println(studentRepository.getById(id));
        return studentRepository.getById(id);
    }

    @Override
    public Student getOne(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Collection<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Collection<Student> getStudentsByDepartment(String dept) {
        return studentRepository.getByDept(dept);
    }

    @Override
    public Student addStudent(Student student) {
        if(student.getId() >=0 ){
            throw new InvalidInputException("Id should not be present for new user");
        } else if (student.getName() == null){
            throw new InvalidInputException("Name is null");

        } else if (student.getDept() == null){
            throw new InvalidInputException("Dept is null");
        }
        return studentRepository.save(student);
    }

    @Override
    public void removeStudent(int id) {
        studentRepository.delete(getOne(id));
    }

    public Student updateStudent(Student student,int id) {
        if(!studentRepository.existsById(id))throw new EntityNotFoundException();
        return studentRepository.save(student);
    }

    public Student updateStudentName(int id,String name) {
        Student student = null;
        if(name != null && name.length()==0)throw new InvalidInputException("Name is null");
        if(!studentRepository.existsById(id))throw new EntityNotFoundException();
        student = studentRepository.findById(id).get();
        student.setName(name);
        studentRepository.save(student);
        return student;
    }


}
