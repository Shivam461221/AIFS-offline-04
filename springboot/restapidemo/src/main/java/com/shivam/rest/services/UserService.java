package com.shivam.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.rest.models.User;
import com.shivam.rest.repos.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createUser(User user) {
		userRepository.save(user);
		return "User Created";
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}

	public String removeUser(Long id) {
		userRepository.deleteById(id);

		return "User Deleted";
	}

	public String updateUser(Long id, User updatedUser) {
		Optional<User> existingUserOptional = userRepository.findById(id);

		if (existingUserOptional.isPresent()) {
			User existingUser = existingUserOptional.get();

			if (updatedUser.getName() != null) {
				existingUser.setName(updatedUser.getName());
			}

			if (updatedUser.getEmail() != null) {
				existingUser.setEmail(updatedUser.getEmail());
			}

			userRepository.save(existingUser);

			return "User updated";
		}

		return "User Not found";
	}

}
