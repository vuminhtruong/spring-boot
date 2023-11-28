package com.truongvu.springrestcrud.rest;

import com.truongvu.springrestcrud.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return studentList.get(studentID);
    }
}
