package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController
public class StudentController{

    @Autowired
    StudentService ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }

    @GetMapping("/fetchdata")
    public List<Student> fetchRecord(){
        return ser.fetchRecord();
    }

    @GetMapping("/fetchbyid/{id}")
    public Optional<Student> fetchById(@PathVariable int id){
        return ser.fetchById(id);
    }

    @
}