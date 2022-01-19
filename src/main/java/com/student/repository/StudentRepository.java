package com.student.repository;

import com.student.core.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, BigInteger> {

    @Query(value = "SELECT * FROM STUDENT WHERE STUDENT.DEPARTMENT = :dept",nativeQuery=true)
    Collection<Student> getByDept(@Param("dept") String dept);
}
