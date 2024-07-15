package com.nguyen.demo.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nguyen.demo.rest_api.bean.Student;

@RestController
public class StudentController {

    //http://localhost:8081/student
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
        1,
        "Nguyen",
        "Vo");
        return student;
    }

}
