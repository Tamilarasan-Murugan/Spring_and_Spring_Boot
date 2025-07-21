package org.example;

public class Student {

    private int age;
    private int rno;
    private Writer writer;

    public Student(int age, int rno, Writer writer) {
        this.age = age;
        this.rno = rno;
        this.writer = writer;
    }
    public Student(){

    }

    public void Show(){
        System.out.println("Hi,i'm in Show Method..");
    }

    public void writeExam(){
        writer.write();
    }
}