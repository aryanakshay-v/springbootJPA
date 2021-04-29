package com.example.demo.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface LessonRepository extends CrudRepository<Lesson, Integer> {
	
			public List<Lesson> findByCourseId(Integer courseID);
	/*
	 * public List<Course> getCoursesByStudent(Integer studentID); public
	 * List<Course> getCoursesByStudentName(String name);
	 */
}