package com.truongvu.springrestcrud.rest;

import com.truongvu.springrestcrud.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private final List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void loadData() {
        studentList.add(new Student("Truong","Vu"));
        studentList.add(new Student("Nam","Tran"));
        studentList.add(new Student("Trung","Nguyen"));
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentList;
    }

    @GetMapping("/student/{studentID}")
    public Student getStudent(@PathVariable int studentID) {
        if((studentID >= studentList.size()) || (studentID < 0)){
            throw new StudentNotFoundException("Student id not found - " + studentID);
        }

        return studentList.get(studentID);
    }


}
