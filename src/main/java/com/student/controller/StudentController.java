package com.student.controller;



//Added comments in branch_1
import com.student.core.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/{id}")
    public Student getOne(@PathVariable("id") int id) {
        return studentService.getOne(id);
    }

    @GetMapping("/")
    public Collection<Student> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping("/department/{dept}")
    public Collection<Student> getStudentsBySection(@PathVariable("dept") String dept) {
        return studentService.getStudentsByDepartment(dept);
    }

    @PostMapping("/")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student student1=studentService.addStudent(student);
        return new ResponseEntity<Student>(student1,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> removeStudent(@PathVariable("id") int id) {
        studentService.removeStudent(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,@RequestBody Student student) {
        studentService.updateStudent(student,id);
        return ResponseEntity.accepted().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Student> updateStudentName(@PathVariable("id") int id, @RequestParam("name") String name) {
        studentService.updateStudentName(id, name);
        return ResponseEntity.accepted().build();

    }
}
