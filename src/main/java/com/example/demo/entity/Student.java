package com.example.demo.entity

import jakarta.persistence.*;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String stuname;
    private String stumail;
    private float cgpa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStuname() {
        return stuname;
    }
    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
    public String getStumail() {
        return stumail;
    }
    public void setStumail(String stumail) {
        this.stumail = stumail;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int id, String stuname, String stumail, float cgpa) {
        // this.id = id;
        this.stuname = stuname;
        this.stumail = stumail;
        this.cgpa = cgpa;
    }
    public Student() {
        
    }
}
