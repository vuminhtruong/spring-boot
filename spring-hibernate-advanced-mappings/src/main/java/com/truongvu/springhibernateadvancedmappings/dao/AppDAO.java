package com.truongvu.springhibernateadvancedmappings.dao;

import com.truongvu.springhibernateadvancedmappings.entity.Instructor;
import com.truongvu.springhibernateadvancedmappings.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor instructor);

    Instructor findInstructorById(int theID);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int id);
}
