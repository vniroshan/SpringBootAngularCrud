package com.niroshan.demo.implementation;

import com.niroshan.demo.model.Student;
import com.niroshan.demo.repository.StudentRepository;
import com.niroshan.demo.service.StudentService;
import com.niroshan.demo.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    //@Autowired
    //private StudentUtil Util;



    public Integer saveStudent(Student s) {

        //Util.calculateDtls(s);
        StudentUtil.calculateDtls(s);
        s = repo.save(s);
        return s.getStdId();
    }


    public void updateStudent(Student s) {

        StudentUtil.calculateDtls(s);
        repo.save(s);

    }

    public void deleteStudent(Integer id) {
        repo.deleteById(id);


    }

    public Student getOneStudent(Integer id) {
        Optional<Student> opt = repo.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
