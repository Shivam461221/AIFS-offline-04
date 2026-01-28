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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.rest.models.Faculty;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

	private List<Faculty> faculties = new ArrayList<>(
			Arrays.asList(new Faculty(101, "Shivam", "CS"), new Faculty(102, "Sourabh", "Polity")));

	@GetMapping
	public List<Faculty> getAll() {
		return faculties;
	}

	@GetMapping("/{id}")
	public Faculty getById(@PathVariable Integer id) {
		return faculties.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
	}
	
//	@GetMapping("/")
//	public Faculty getById(@RequestParam Integer id) {
//		return faculties.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
//	}

//	@PostMapping
//	public String addFaculty(@RequestBody Faculty faculty) {
//		
//		faculties.add(faculty);
//		
//		return "Faculty created";
//	}

	@PostMapping
	public Faculty addFaculty(@RequestBody Faculty faculty) {

		faculties.add(faculty);

		return faculty;
	}

	@DeleteMapping("/{id}")
	public String deleteFacultyById(@PathVariable Integer id) {
		faculties.removeIf(f -> f.getId() == id);

		return "Faculty deleted";
	}

	@PutMapping("/{id}")
	public String updateFacultyById(@PathVariable Integer id, @RequestBody Faculty faculty) {
		for (Faculty f : faculties) {
			if (f.getId() == id) {
				f.setName(faculty.getName());
				f.setSubject(faculty.getSubject());

				return "Faculty Updated";
			}
		}

		return "Faculty not updated";
	}
}
