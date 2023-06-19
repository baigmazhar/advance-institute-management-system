package com.aim.advanceinstitutemanagement.controller;

import com.aim.advanceinstitutemanagement.entity.Student;
import com.aim.advanceinstitutemanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public List<Student> getStudent(){
        List<Student> studentList = studentService.getStudent();
        return studentList;
    }

    @GetMapping("student/{studentId}")
    public Student getSingleStudent(@PathVariable int studentId){
        Student student = studentService.getSingleStudent(studentId);
        return student;
    }
}
