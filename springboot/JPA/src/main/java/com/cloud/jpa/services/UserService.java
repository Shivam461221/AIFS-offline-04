package com.cloud.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.jpa.entities.User;
import com.cloud.jpa.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User addUser(User user) {
		if(user.getFirstName()!=null && user.getLastName()!=null) {
			return userRepository.save(user);
		}
		return null;
	}
	
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		return "User Deleted";
	}
	
	public User findUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
}
