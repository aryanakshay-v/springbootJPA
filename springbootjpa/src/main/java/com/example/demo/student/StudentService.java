package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	//CRUD
	@Autowired
	StudentRepository studentRepository;

	List<Student> students = new ArrayList<>();


	public void createStudents() {

		students.add(new Student(1, "akshay", 1, 96));
		students.add(new Student(2, "aryan", 2, 97));
		students.add(new Student(3, "subbu",3, 98));
		students.add(new Student(4, "sanjay", 4, 99));
	}

	public List<Student> getStudents(){
		//createStudents();
		//return students;
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudent(int id) {
		return studentRepository.findById(id).get();
		
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
		/*
		 * System.out.println("controllers add student"); students.add(student);
		 */
	}

	public void updateStudent(Student student, int id) {
		studentRepository.save(student);
	}

	public void removeStudent(int id) {
		studentRepository.deleteById(id);
		//students.removeIf(s -> s.getId() == id);
	}

}