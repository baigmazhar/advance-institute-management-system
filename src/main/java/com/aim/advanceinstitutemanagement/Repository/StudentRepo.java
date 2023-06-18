package com.aim.advanceinstitutemanagement.Repository;

import com.aim.advanceinstitutemanagement.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentRepo {
    @Bean
    public List<Student> getStudent() {

        List<Student> student = new ArrayList<>();
        student.add(new Student(101, "Saad", 12345641));
        student.add(new Student(102, "Fatema", 989898989));
        student.add(new Student(103, "Zikra", 45656565));
        student.add(new Student(104, "Zainab", 323223232));

        return student;
    }
}
