package com.loiane;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loiane.model.Course;
import com.loiane.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository)
	{
		return args ->{
			courseRepository.deleteAll();
			
			Course c = new Course("ANGULAR COM SPRING", "FRONT-END");
	
			
			courseRepository.save(c);
			
		};
	}
	
}
