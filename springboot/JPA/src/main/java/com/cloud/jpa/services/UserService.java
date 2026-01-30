package com.cloud.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.jpa.entities.User;
import com.cloud.jpa.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User addUser(User user) {
		if (user.getFirstName() != null && user.getLastName() != null) {
			return userRepository.save(user);
		}
		return null;
	}

	public String deleteUser(Long id) {

		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
			return "User Deleted";
		}

		return "User not found";
	}

	public User findUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public String updateUser(Long id, User user) {
		Optional<User> userOpt = userRepository.findById(id);
		
		if(userOpt.isPresent()) {
			User user2 = userOpt.get();
			user2.setFirstName(user.getFirstName());
			user2.setLastName(user.getLastName());
			user2.setPassword(user.getPassword());
			userRepository.save(user2);
			return "User updated";
		}
		
		return "User not found";
	}

}
