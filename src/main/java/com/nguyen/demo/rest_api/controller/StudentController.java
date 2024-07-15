package com.nguyen.demo.rest_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nguyen.demo.rest_api.bean.Student;

@RestController
@RequestMapping("students")
public class StudentController {

    //http://localhost:8081/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(
        1,
        "Nguyen",
        "Vo");
        //return new ResponseEntity<>(student, HttpStatus.OK);
        //return ResponseEntity.ok(student);
        return ResponseEntity.ok()
                                .header("custome-header", "nguyen")
                                .body(student);
    }

    //http://localhost:8081/students
    @GetMapping
    public List<Student> getStudents(){
        Student student1 = new Student(1, "nguyen", "vo");
        Student student2 = new Student(2, "nguyen", "truong");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(new Student(3, "truong", "vo"));
        return students;

    }

    //Spring Boot RestAPI with path varible
    //http://localhost:8081/student/id=1&first_name=nguyen
    @GetMapping("id={id}&first_name={first_name}")
    public Student studentPathVariable(@PathVariable("id") int id, @PathVariable("first_name") String firstName){
        return new Student(id, firstName, "vo");
    }

    //Spring Boot RestAPI with Request Param
    //http://localhost:8081/student/query?id=1&firstName=nguyen
    @GetMapping("query")
    public Student studentRequestParam(@RequestParam int id,
                                       @RequestParam String firstName){
        return new Student(id, firstName, "vo");
    }

    //Spring Boot RestAPI that handles HTTP POST request
    //@PostMapping and @RequestBody
    //http://localhost:8081/students/create
    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    //Spring Boot RestAPI that handles HTTP PUT request - updating existing resource
    //http://localhost:8081/students/3/update
    @PutMapping("{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    //Spring Boot RestAPI that handles HTTP DELETE request - deleting existing resource
    //http://localhost:8081/students/3/delete   
    @DeleteMapping("{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        return "Successful deleted student have id is: " + studentId;
    }

}
