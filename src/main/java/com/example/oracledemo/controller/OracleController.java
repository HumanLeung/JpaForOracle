package com.example.oracledemo.controller;

import com.example.oracledemo.entity.Student;
import com.example.oracledemo.repository.OracleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class OracleController {

    private final OracleRepository oracleRepository;

    @Autowired
    public OracleController(OracleRepository oracleRepository){
       this.oracleRepository = oracleRepository;
    }

    @GetMapping("/add")
    public String test(){
       Student student = new Student("linda",12);
      oracleRepository.save(student);
      return "ok";
    }

}
