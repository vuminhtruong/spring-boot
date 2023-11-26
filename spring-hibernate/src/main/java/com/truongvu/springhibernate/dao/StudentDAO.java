package com.truongvu.springhibernate.dao;

import com.truongvu.springhibernate.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastNam);
}
