package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {

//    int age;

    @Autowired
    @Qualifier("pen")
    private Writer writer;


    public void writeExam(){
        writer.write();
    }
}
