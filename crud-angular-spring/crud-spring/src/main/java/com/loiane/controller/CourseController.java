package com.loiane.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.model.Course;
import com.loiane.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	
	private  CourseRepository courseRepository;
		
	//ao inves de autowride, usar a instanciação da dependencia no construtor pois ela é obrigatória
	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}



	@GetMapping
	public List<Course> list()
	{
		//chama o repositorio e retorna a lista
		return courseRepository.findAll();
	}

}
