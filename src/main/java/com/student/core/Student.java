package com.student.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "STUDENT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name = "NAME")
    private String name;
    @Column(name = "DEPARTMENT")
    private String dept;

//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Games.class)
//    @JoinColumn(name = "STUDENTID", referencedColumnName = "ID")
//    List<Games> games;
//
//    public List<Games> getGames() {
//        return games;
//    }
//
//    public void setGames(List<Games> games) {
//        this.games = games;
//    }

    public Student() {
    }

    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

/*  ONE TO ONE WITH COURSE TABLE
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID",referencedColumnName = "STUDENTID")
    Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

 */


    /*  ONE TO MANY WITH GAMES TABLE

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "STUDENTID", referencedColumnName = "ID")
    List<Games> games;

    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }

     */
