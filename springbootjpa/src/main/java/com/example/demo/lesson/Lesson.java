package com.example.demo.lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.course.Course;

@Entity
public class Lesson {

	@Id
	int id;
	String name;
	int sem;
	
	@OneToMany
	private Course course;
	
	public Lesson() {}
	public Lesson(int id, String name, int sem, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
	