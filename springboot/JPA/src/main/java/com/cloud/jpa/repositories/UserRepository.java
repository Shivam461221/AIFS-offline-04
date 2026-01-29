package com.cloud.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.jpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
