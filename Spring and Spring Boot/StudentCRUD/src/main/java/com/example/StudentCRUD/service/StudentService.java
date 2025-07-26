package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students=new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Tamilarasan","SpringBoot"),
                    new Student(2,"SabariNathan","java")
            )
    );
    public List<Student> getStudents(){
        return students;
    }

    public Student getStdByRno(int roolno) {
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==roolno){
                index=i;
                found=true;
                break;
            }
        }
        if(found){
            return students.get(index);
        }else return new Student(0,"","");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String updateStudent(Student student) {
        int index=0;
        boolean found=false;
        for (int i=0;i<students.size();i++){
            if(students.get(i).getRno()==student.getRno()){
                index=i;
                found=true;
                break;
            }
        }
        if(found){
            students.set(index,student);
            return "updated successfully";
        }
        else{
            return "No match found !";
        }
    }

    public String deleteStudent(int rno) {
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rno){
                index=i;
                found=true;
                break;
            }
        }
        if(found){
            students.remove(index);
            return "successfully deleted";
        }else {
            return "No match found !";
        }
    }
}
