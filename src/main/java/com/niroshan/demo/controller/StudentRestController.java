package com.niroshan.demo.controller;

import com.niroshan.demo.model.Student;
import com.niroshan.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired
    private StudentService service;

    //1.save
    @PostMapping("/create")
    public ResponseEntity<String> saveStudent(
            @RequestBody Student student
            )
    {
        Integer id = service.saveStudent(student);
        String body = "Student saved with Id" + id;

        return ResponseEntity.ok(body);
    }

    //2.Fetch all
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> list = service.getAllStudents();
        return ResponseEntity.ok((list));
    }

    //3.Fetch one
    @GetMapping("/one/{id}")
    public ResponseEntity<Student> getOneStudent(
            @PathVariable Integer id
    )
    {
        Student s = service.getOneStudent(id);
        return  ResponseEntity.ok(s);
    }

    //4.Delete
    @DeleteMapping("remove/{id}")
    public ResponseEntity<String> deleteStudent(
            @PathVariable Integer id
    )
    {
        service.deleteStudent(id);
        String body = "Student Deleted" + id;
        return ResponseEntity.ok(body);
    }

     //5. update

    public ResponseEntity<String> updateEmployee(
            @RequestBody Student student
    )
    {
        service.updateStudent(student);
        String body = "Student Updated" + student;
        return ResponseEntity.ok(body);
    }

}
