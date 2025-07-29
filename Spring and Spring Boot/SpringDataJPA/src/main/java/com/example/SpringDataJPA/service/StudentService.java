package com.example.SpringDataJPA.service;

import com.example.SpringDataJPA.model.Student;
import com.example.SpringDataJPA.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);//add
    }

    public Student getStudentByRno(int rno) {
        return studentRepo.findById(rno).orElse(null);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);//update
    }

    public void deleteStudentByRno(int rno) {
        studentRepo.deleteById(rno);
    }

    public void clearStudents() {
        studentRepo.deleteAll();
    }

    public List<Student> getStudentsByTechnology(String technology) {
        return studentRepo.findByTechnology(technology);
    }

    public List<Student> getStudentsByGenderAndTechnology(String gender, String technology) {
        return studentRepo.findByGenderAndTechnolgy(gender,technology);
    }
}
