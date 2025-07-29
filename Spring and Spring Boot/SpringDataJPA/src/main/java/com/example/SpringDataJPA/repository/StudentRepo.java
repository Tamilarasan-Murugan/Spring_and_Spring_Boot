package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findByTechnology(String technolgy);// Own Query

    @Query(nativeQuery = true,
    value = "select * from student where gender =:gender and technology =:technology")
    List<Student> findByGenderAndTechnolgy(
            @Param("gender") String gender,@Param("technology") String technology
    );
}
