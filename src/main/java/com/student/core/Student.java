package com.student.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "STUDENT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DEPARTMENT")
    private String dept;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID",referencedColumnName = "STUDENTID")
    Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "STUDENTID", referencedColumnName = "ID")
    List<Games> games;

    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }
    
    public Student() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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
    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "STUDENTID", referencedColumnName = "ID")
    List<Games> games;

     */
