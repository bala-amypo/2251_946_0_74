package com.example.demo.service.implement;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import com.example.demo.entity.Student; 
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService{

    @Autowired
    StudentRepository sturep;

    @Override
    public Student createData(Student stu){
        return sturep.save(stu);
    }

    @Override
    public List<Student> fetchRecord(){
        return sturep.findAll();
    }

    @Override
    public Optiona<Student> fetchById(int id){
        return sturep.findById(id);
    }
}