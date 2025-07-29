package com.example.SpringDataJPA.controller;

import com.example.SpringDataJPA.model.Student;
import com.example.SpringDataJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("students/{rno}")
    public ResponseEntity<Student> getStudentByRno(@PathVariable("rno") int rno){
        Student student=studentService.getStudentByRno(rno);
        if (student==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("students")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("Student Added Successfully !",HttpStatus.CREATED);
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Student Updated Successfully !";
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudentByRno(@PathVariable("rno") int rno){
        studentService.deleteStudentByRno(rno);
        return "Student Deleted Successfully !";
    }

    @DeleteMapping("students/clear")
    public String clearStudents(){
        studentService.clearStudents();
        return "Successfully Cleared All Students !";
    }

    @GetMapping("students/technology/{tech}")
    public List<Student> getStudentsByTechnology(@PathVariable("tech")String technology){
        return studentService.getStudentsByTechnology(technology);
    }

    @PostMapping("students/filter")
    public List<Student> getStudentsByGenderAndTechnology(@Param("gender")String gender,@Param("technology")String technology){
        return studentService.getStudentsByGenderAndTechnology(gender,technology);
    }
}
