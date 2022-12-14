package com.example.demo.service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO dao;

    public String addStudent(Student student) {
       dao.save(student);
        return "Student added. Roll number is " + student.getRoll();
    }

    public String addStudents(List<Student> students) {
        return "All new Student has been added into Database";
    }

    public String deleteStudent(int roll) {

        return "Roll Number is deleted :"+roll;
    }

    public String updateStudent(Student student) {

        return "Roll Number is update :"+student.getRoll();
    }

//    public Student getStudent(int roll) {
//        return ;
//    }

}