package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Interger>{
}