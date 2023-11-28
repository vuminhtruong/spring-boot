package com.truongvu.springrestcrud.rest;

import com.truongvu.springrestcrud.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/student")
    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Truong","Vu"));
        studentList.add(new Student("Nam","Tran"));
        studentList.add(new Student("Trung","Nguyen"));

        return studentList;
    }
}
