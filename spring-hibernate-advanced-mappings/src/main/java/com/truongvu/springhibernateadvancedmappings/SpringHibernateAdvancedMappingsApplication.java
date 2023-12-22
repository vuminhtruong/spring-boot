package com.truongvu.springhibernateadvancedmappings;

import com.truongvu.springhibernateadvancedmappings.dao.AppDAO;
import com.truongvu.springhibernateadvancedmappings.entity.Course;
import com.truongvu.springhibernateadvancedmappings.entity.Instructor;
import com.truongvu.springhibernateadvancedmappings.entity.InstructorDetail;
import com.truongvu.springhibernateadvancedmappings.entity.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
//          findInstructorWithCourses(appDAO);
//			findCoursesForInstructor(appDAO);
//			findInstructorWithCoursesJoinFetch(appDAO);
//			updateInstructor(appDAO);
//			updateCourse(appDAO);
//			deleteInstructor(appDAO);
//			deleteCourse(appDAO);
//			createCourseAndReview(appDAO);
//			retrieveCourseAndReviews(appDAO);
			deleteCourseAndReviews(appDAO);
		};
	}

	private void deleteCourseAndReviews(AppDAO appDAO) {
		int id = 10;
		System.out.println("Deleting course id: " + id);
		appDAO.deleteCourseById(id);
	}

	private void retrieveCourseAndReviews(AppDAO appDAO) {
		int id = 10;
		Course course = appDAO.findCourseAndReviewsByCourseId(id);
		System.out.println(course);
		System.out.println(course.getReviews());
	}

	private void createCourseAndReview(AppDAO appDAO) {
		Course course = new Course("NodeJS");
		course.addReview(new Review("Great..."));
		course.addReview(new Review("Easy course"));

		System.out.println("Saving the course");
		System.out.println(course);
		System.out.println(course.getReviews());

		appDAO.save(course);
	}

	private void deleteCourse(AppDAO appDAO) {
		int id = 10;
		System.out.println("Deleting course id: " + id);
		appDAO.deleteCourseById(id);
	}

	private void updateCourse(AppDAO appDAO) {
		int id = 10;
		System.out.println("Finding course id: " + id);
		Course course = appDAO.findCourseById(id);
		System.out.println("Updating course id: " + id);
		course.setTitle("Kotlin");
		appDAO.update(course);
	}

	private void updateInstructor(AppDAO appDAO) {
		int id = 1;
		System.out.println("Finding instructor id: " + id);
		Instructor instructor = appDAO.findInstructorById(id);
		System.out.println("Updating instructor id: " + id);
		instructor.setLastName("Isco");
		appDAO.update(instructor);
	}

	private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
		int id = 1;
		System.out.println("Finding instructor id: " + id);
		Instructor instructor = appDAO.findInstructorByIdJoinFetch(id);
		System.out.println("Instructor: " + instructor);
		System.out.println("Courses: " +  instructor.getCourses());
	}

	private void findCoursesForInstructor(AppDAO appDAO) {
		int id = 1;
		System.out.println("Finding instructor id: " + id);
		Instructor instructor = appDAO.findInstructorById(id);
		System.out.println("Instructor: " + instructor);
		System.out.println("Finding courses for instructor id: " + id);
		List<Course> courses = appDAO.findCoursesByInstructorId(id);
		instructor.setCourses(courses);
		System.out.println("Courses: " + instructor.getCourses());
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
