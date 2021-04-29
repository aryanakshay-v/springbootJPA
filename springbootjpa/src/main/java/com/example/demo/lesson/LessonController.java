package com.example.demo.lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.Course;
import com.example.demo.course.CourseService;
import com.example.demo.student.Student;

@RestController
public class LessonController {
	
	@Autowired
	LessonService lessonService;
	
	@RequestMapping("/cources/{id}/lessons")
	public List<Lesson> getAllLessons(@PathVariable int id){   //fetching all resources
		System.out.println("lesson controller -- getall courses");
		return lessonService.getLessons(id);
		
	}
//	@RequestMapping("/students/{foo}")	
//	public Student getStudent(@PathVariable("foo") int id) {

	@RequestMapping("/students/{studentId}/courses/{courseId}")   
	public Lesson getLesson(@PathVariable int id) {  //getting a particular resource
		
		return  lessonService.getLesson(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="courses/{studentID}/lessons") //create a resource
	public void addLesson(@RequestBody Lesson lesson,@PathVariable int courseID) {
		lesson.setCourse(new Course(courseID,"",0,0, courseID));
		lessonService.addLesson(lesson);
	}

}
