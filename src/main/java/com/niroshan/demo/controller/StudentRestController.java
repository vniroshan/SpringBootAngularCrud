package com.niroshan.demo.controller;

import com.niroshan.demo.model.Student;
import com.niroshan.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
