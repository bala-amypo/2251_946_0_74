package com.example.demo.repository;
import org.springframework.web.bind.annotations.*;
import org.springframework.stereotypr

@Repository
public interface StudentRepository extends JpaRepository<Student,Interger>{
}