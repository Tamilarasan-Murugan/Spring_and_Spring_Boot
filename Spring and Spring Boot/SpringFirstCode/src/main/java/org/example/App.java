package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        Student student= (Student) context.getBean("std1");
        //student.setAge(22);
        //System.out.println(student.getRno());
        //System.out.println(student.getAge());
        student.writeExam();
    }
}