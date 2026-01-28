package com.cloud.rest.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.rest.models.Student;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	private List<Student> student = new ArrayList<>(
			Arrays.asList(new Student(101, "Shivam", "MCA", 25), new Student(102, "Sourabh", "Btech", 24)));

	@GetMapping
	public List<Student> getAllStudents() {
		return student;
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return student.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
	}
	
	@PostMapping
	public String addStudent(@RequestBody Student s) {
		student.add(s);
		return "Student added successfully";
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		
		student.removeIf(s->s.getId()==id);
		return "Student deleted";
	}
	
//	@PutMapping("/{id}")
//	public String updateStudent(@PathVariable Integer id, @RequestBody Student studentData) {
//		System.out.println("ID: "+ id);
//		System.out.println("Data "+studentData.getName()+" "+studentData.getCourse());
//		for(Student s: student) {
//			if(s.getId()==id) {
//				s.setName(studentData.getName());
//				s.setCourse(studentData.getCourse());
//				s.setAge(studentData.getAge());
//				return "Student updated";
//			}
//		}
//		
//		return "Student not updated";
//	}
	
	
	@PutMapping("/{id}")
	public String updateStudent(@PathVariable Integer id, @RequestBody Student studentData) {
		for (Student s : student) {
			if (s.getId() == id) {
				s.setName(studentData.getName());
				s.setCourse(studentData.getCourse());
				s.setAge(studentData.getAge());

				return "Student updated";
			}
		}

		return "Student not found";
	}
	

}
