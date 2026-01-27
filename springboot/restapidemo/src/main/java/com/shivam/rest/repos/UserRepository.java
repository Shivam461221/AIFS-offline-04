package com.shivam.rest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.rest.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
