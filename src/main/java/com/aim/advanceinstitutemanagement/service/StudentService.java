package com.aim.advanceinstitutemanagement.service;

import com.aim.advanceinstitutemanagement.entity.Student;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface StudentService {
    @Bean
    public List<Student> getStudent();

    public Student getSingleStudent(int studentId);
}
