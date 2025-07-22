package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("22")
    private int rno;

//    @Autowired
//    @Qualifier("pen")
    private Writer writer;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWriter() {
        return writer;
    }

    @Autowired
    @Qualifier("pencil")
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void writeExam(){
        writer.write();
    }
}
