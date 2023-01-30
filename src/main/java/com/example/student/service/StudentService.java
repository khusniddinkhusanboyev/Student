package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }


    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public boolean existsById(Long id){
        return studentRepository.existsById(id);
    }

    public void deletById(Long id){
        studentRepository.deleteById(id);
    }

}
