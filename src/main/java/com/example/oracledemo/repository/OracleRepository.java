package com.example.oracledemo.repository;

import com.example.oracledemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OracleRepository extends JpaRepository<Student,Integer> {

    Optional<Student> findById(Integer id);

}
