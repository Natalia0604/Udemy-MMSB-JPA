package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository Repository;
	
//	@Autowired
//	private CourseJpaRepository Repository;
	
	@Autowired
	private CourseSpringDataJpaRepository Repository;
	
	//JPA method
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Repository.insert(new Course(1,"Learn AWS","in28minutes"));
//		Repository.insert(new Course(2,"Learn Java","in28minutes"));
//		Repository.insert(new Course(3,"Learn Python","in28minutes"));
//		
//		Repository.deleteById((long) 2);
//		
//		System.out.println(Repository.findById((long) 1));
//		System.out.println(Repository.findById((long) 3));
//		
//	}
	
	// spring JPA method
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Repository.save(new Course(1,"Learn AWS","in28minutes"));
		Repository.save(new Course(2,"Learn Java","in28minutes"));
		Repository.save(new Course(3,"Learn Python","in28minutes"));
		
		Repository.deleteById((long) 2);
		
		System.out.println(Repository.findById((long) 1));
		System.out.println(Repository.findById((long) 3));
		
		System.out.println(Repository.findAll());
		System.out.println(Repository.count());
		
		System.out.println(Repository.findByAuthor("in28minutes"));
		System.out.println(Repository.findByAuthor(""));
		
	}

}
