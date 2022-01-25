package com.student.core;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "COURSE")
public class Course {
    @Column(name = "COURSEID")
    private int courseId;
    @Column(name = "COURSENAME")
    private String courseName;
    @Id
    @Column(name = "STUDENTID")
    private BigInteger studentId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public BigInteger getStudentId() {
        return studentId;
    }

    public void setStudentId(BigInteger studentId) {
        this.studentId = studentId;
    }

    public Course() {
    }


}

