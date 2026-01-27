package com.shivam.rest.controllers;

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

import com.shivam.rest.models.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	List<Student> students = new ArrayList<>(
			Arrays.asList(new Student(1, "shivam", "shivam@123"), new Student(2, "kuldeep", "kuldeep@123")));

	@GetMapping
	public List<Student> getAllStudents() {
		return students;
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
	}

	@PostMapping
	public String createStudent(@RequestBody Student student) {
		students.add(student);
		return "Student added successfully!";
	}

	@PutMapping("/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student student) {
		for (Student s : students) {
			if (s.getId() == id) {
				s.setName(student.getName());
				s.setEmail(student.getEmail());

				return "Student updated";
			}
		}

		return "Student not found";
	}

	@DeleteMapping("/{id}")
	public String removeStudent(@PathVariable int id) {
		students.removeIf(s -> s.getId() == id);
		return "Student removed";
	}

}
