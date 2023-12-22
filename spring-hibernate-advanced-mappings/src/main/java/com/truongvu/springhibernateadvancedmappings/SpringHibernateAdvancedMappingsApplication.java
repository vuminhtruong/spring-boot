package com.truongvu.springhibernateadvancedmappings;

import com.truongvu.springhibernateadvancedmappings.dao.AppDAO;
import com.truongvu.springhibernateadvancedmappings.entity.Course;
import com.truongvu.springhibernateadvancedmappings.entity.Instructor;
import com.truongvu.springhibernateadvancedmappings.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateAdvancedMappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateAdvancedMappingsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
//			createInstructor(appDAO);
//			findInstructor(appDAO);
//			deleteInstructor(appDAO);
//			findInstructorDetail(appDAO);
//			deleteInstructorDetail(appDAO);
//			createInstructorWithCourse(appDAO);
            findInstructorWithCourses(appDAO);
		};
	}

    private void findInstructorWithCourses(AppDAO appDAO) {
        int id = 1;
        System.out.println("Finding instructor id: " + id);
        Instructor instructor = appDAO.findInstructorById(id);
        System.out.println("Instructor: " + instructor);
        System.out.println("Courses: " + instructor.getCourses());
    }

    private void createInstructorWithCourse(AppDAO appDAO) {
		Instructor tempInstructor = new Instructor("Truong","Vu","test1@test.com");
		InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/sadffsd123","Football");
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		Course course1 = new Course("Java");
		Course course2 = new Course("Devops");

		tempInstructor.addCourse(course1);
		tempInstructor.addCourse(course2);

		System.out.println("Saving instructor: " + tempInstructor);
		System.out.println("The courses: " + tempInstructor.getCourses());
		appDAO.save(tempInstructor);
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int id = 3;
		System.out.println("Deleting instructor detail id: " + id);
		appDAO.deleteInstructorDetailById(id);
		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int id = 3;
		InstructorDetail instructorDetail = appDAO.findInstructorDetailById(id);
		System.out.println("Instructor Detail : " + instructorDetail);
		System.out.println("Instructor : " + instructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteInstructorById(theId);
		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: " + tempInstructor);
	}

	private void createInstructor(AppDAO appDAO){
		Instructor tempInstructor = new Instructor("Truong","Vu","test1@test.com");
		InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/sadffsd123","Football");
		tempInstructor.setInstructorDetail(tempInstructorDetail);
		System.out.println("Saving instructor: " + tempInstructorDetail);
		appDAO.save(tempInstructor);
	}
}
