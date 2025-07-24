package com.example.GetPost.service;

import com.example.GetPost.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {

    List<Student> students=new ArrayList<>(
            Arrays.asList(new Student(1,"Tamilarasan","Spring Boot"),
                    new Student(2,"Tharunkumar","React"),
                    new Student(3,"Vinith","Angular"),
                    new Student(4,"Sabari","java"))
    );

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(int rno, String name, String technology) {
        Student student=new Student(rno,name,technology);
        students.add(student);
    }
}
