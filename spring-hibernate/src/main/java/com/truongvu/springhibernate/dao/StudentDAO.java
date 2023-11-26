package com.truongvu.springhibernate.dao;

import com.truongvu.springhibernate.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);
}
