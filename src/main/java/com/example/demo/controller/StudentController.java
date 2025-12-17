package com.example.demo.controller;
import org.springframework.web.bind.annotations.*;


@RestController
public class StudentController{

    @AutoWired
    StudentService ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createDate(stu);
    }

    @GetMapping("/fetchdata")
    public List<Student> fetchRecord(){
        return ser.fetchRecord();
    }
}