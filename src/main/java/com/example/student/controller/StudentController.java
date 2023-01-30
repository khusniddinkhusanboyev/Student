package com.example.student.controller;

import com.example.student.StudentApplication;
import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired//injection
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Student student){
        Student student1=studentService.save(student);
        return ResponseEntity.ok(student1);
    }

    @GetMapping("/get_all")
    public ResponseEntity getAll(){
        List<Student> studentList=studentService.findAll();
        return ResponseEntity.ok(studentList);
    }

}
