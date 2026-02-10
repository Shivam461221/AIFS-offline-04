package com.cloud.jpa.dtos;

import lombok.Data;

@Data
public class RegisterRequest {
	
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private int age;
	    private String role;
}
