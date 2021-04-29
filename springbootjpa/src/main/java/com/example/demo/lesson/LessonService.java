package com.example.demo.lesson;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.course.Course;

@Service
public class LessonService {
	@Autowired
	LessonRepository lessonRepository;

	List<Lesson> courses = new ArrayList<>(); 

	public List<Lesson> getLessons(int id){
		List<Lesson> courses = new ArrayList<>();
		lessonRepository.findByCourseId(id).forEach(courses::add);
		return courses;
	}

	public Lesson getLesson(int id) {
		//courseRepository.findByStudentID(id);
		return lessonRepository.findById(id).get();

	}
	public void addLesson(Lesson course) {
		lessonRepository.save(course);

	}
}
