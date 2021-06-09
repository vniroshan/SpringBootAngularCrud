package com.niroshan.demo.repository;

import com.niroshan.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Integer> {
    //dynamic proxy class + object
}
