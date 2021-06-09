package com.niroshan.demo.service;

import com.niroshan.demo.model.Student;

import java.util.List;

public interface StudentService {
    Integer saveStudent(Student s);
    void updateStudent(Student s);
    void deleteStudent(Integer s);
    Student getOneStudent(Integer id);
    List<Student> getAllStudents();
}
