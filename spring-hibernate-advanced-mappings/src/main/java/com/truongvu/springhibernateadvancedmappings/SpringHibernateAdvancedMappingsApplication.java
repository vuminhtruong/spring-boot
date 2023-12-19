package com.truongvu.springhibernateadvancedmappings;

import com.truongvu.springhibernateadvancedmappings.dao.AppDAO;
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
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO){
		Instructor tempInstructor = new Instructor("Truong","Vu","test1@test.com");
		InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/sadffsd123","Football");
		tempInstructor.setInstructorDetail(tempInstructorDetail);
		System.out.println("Saving instructor: " + tempInstructorDetail);
		appDAO.save(tempInstructor);
	}
}
