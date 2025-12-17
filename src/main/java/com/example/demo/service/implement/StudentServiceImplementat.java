package com.example.demo.service.implement;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotations.*;

import java.util.List;
import com.example.demo.entity.Student; 
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService{

    @AutoWired
    StudentRepository sturep;

    @Override
    public Student createData(Student stu){
        return sturep.save(stu);
    }

    @Override
    public List<Student> fetchRecord(){
        return sturep.findAll();
    }
}