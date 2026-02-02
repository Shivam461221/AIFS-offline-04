package com.cloud.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.crud.entities.User;
import com.cloud.crud.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
//	@GetMapping("/")
//	public List<User> getAllUser(){
//		return userService.getAllUsers();
//	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllUsers(){
		String message = "No data found";
		
		List<User> users = userService.getAllUsers();
		if(users.isEmpty()) {
			//return ResponseEntity.status(HttpStatus.NO_CONTENT).body(message);
			return ResponseEntity.ok(message);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
	
//	@PostMapping("/")
//	public User addUser(@RequestBody User user) {
//		return userService.addUser(user);
//	}
	
	@PostMapping("/")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		
		User createdUser = userService.addUser(user);
		if(createdUser!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not added");
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.findUserById(id);
	}
	
	@PutMapping("/{id}")
	public String updateUser(@PathVariable Long id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}
	
	
	

}
