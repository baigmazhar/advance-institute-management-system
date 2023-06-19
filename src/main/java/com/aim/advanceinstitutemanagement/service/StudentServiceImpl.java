package com.aim.advanceinstitutemanagement.service;

import com.aim.advanceinstitutemanagement.Repository.StudentRepo;
import com.aim.advanceinstitutemanagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
@Configuration
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Bean
    public List<Student> getStudent(){
        List<Student> studentList = studentRepo.getStudent();
        return studentList;
    }

    @Override
    public Student getSingleStudent(int studentId) {
        Student selectedStudent = null;
        List<Student> students = studentRepo.getStudent();
        for(Student singleStudent : students){

            if(singleStudent.getId() == studentId){
                selectedStudent = singleStudent;
            }
        }
        return selectedStudent;
    }
}
