package com.polok.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.polok.springboot.learnjpaandhibernate.course.Course;
import com.polok.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.polok.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// in java code: double quotes, in sql code: single quotes
		repository.save(new Course(1, "Learn AWS Jpa!", "polok"));
		repository.save(new Course(2, "Learn Azure Jpa!", "polok"));
		repository.save(new Course(3, "Learn DevOps Jpa!", "polok"));

		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());

		System.out.println(repository.findByAuthor("polok"));
		System.out.println(repository.findByAuthor(""));

	}
	
}
