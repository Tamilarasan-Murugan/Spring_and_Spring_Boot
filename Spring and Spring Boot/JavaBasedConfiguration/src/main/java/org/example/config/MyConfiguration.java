package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class MyConfiguration {

//    @Bean(name = "std1")
//    public Student student(@Autowired Writer writer){
//        Student st=new Student();
//        st.setRno(332);
//        st.setWriter(writer);
//        return st;
//    }
//
//    @Bean
//    public Pen pen(){
//        return new Pen();
//    }
//
//    @Bean
//    @Primary
//    public Pencil pencil(){
//        return new Pencil();
//    }
}
