package com.truongvu.springhibernateadvancedmappings.dao;

import com.truongvu.springhibernateadvancedmappings.entity.Course;
import com.truongvu.springhibernateadvancedmappings.entity.Instructor;
import com.truongvu.springhibernateadvancedmappings.entity.InstructorDetail;
import com.truongvu.springhibernateadvancedmappings.entity.Student;

import java.util.List;

public interface AppDAO {
    void save(Instructor instructor);

    Instructor findInstructorById(int theID);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int id);

    void deleteInstructorDetailById(int id);

    List<Course> findCoursesByInstructorId(int id);

    Instructor findInstructorByIdJoinFetch(int id);

    void update(Instructor instructor);

    void update(Course course);

    Course findCourseById(int id);

    void deleteCourseById(int id);

    void save(Course course);

    Course findCourseAndReviewsByCourseId(int id);

    Course findCourseAndStudentsByCourseId(int id);

    Student findStudentAndCoursesByStudentId(int id);
}
