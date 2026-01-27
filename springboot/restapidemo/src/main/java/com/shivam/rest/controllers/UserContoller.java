package com.shivam.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.rest.models.User;
import com.shivam.rest.services.UserService;

@RestController
@RequestMapping("/user")
public class UserContoller {
		
		@Autowired
		private UserService userService;
		
		@PostMapping
		public String createUser(@RequestBody User user) {
			return userService.createUser(user);
		}
		
		@GetMapping
		public List<User> getAllUsers(){
			return userService.getAllUsers();
		}
		
		@GetMapping("/{id}")
		public Optional<User> getUserById(@PathVariable Long id){
			return userService.getUserById(id);
		}
		
		@DeleteMapping("/{id}")
		public String removeUser(@PathVariable Long id) {
			return userService.removeUser(id);
		}
		
		@PutMapping("/{id}")
		public String updateUser(@PathVariable Long id,  @RequestBody User user) {
			return userService.updateUser(id, user);
		}
}
