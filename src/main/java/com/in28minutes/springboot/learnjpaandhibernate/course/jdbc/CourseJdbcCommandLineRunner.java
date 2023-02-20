package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
	private CourseJdbcRepository CourseJdbcR;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CourseJdbcR.insert(new Course(1,"Learn AWS","in28minutes"));
		CourseJdbcR.insert(new Course(2,"Learn Java","in28minutes"));
		CourseJdbcR.insert(new Course(3,"Learn Python","in28minutes"));
		
		CourseJdbcR.delete(2);
		
		System.out.println(CourseJdbcR.findById(1));
		System.out.println(CourseJdbcR.findById(3));
		
	}

}
