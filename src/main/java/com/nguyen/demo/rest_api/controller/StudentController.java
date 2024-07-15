package com.nguyen.demo.rest_api.controller;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("students")
    public List<Student> getStudents(){
        Student student1 = new Student(1, "nguyen", "vo");
        Student student2 = new Student(2, "nguyen", "truong");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        return students;

    }

}
