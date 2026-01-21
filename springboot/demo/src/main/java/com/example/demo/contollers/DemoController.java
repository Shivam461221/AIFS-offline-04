package com.example.demo.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/api/demo")
	public String hello() {
		return "Hello from spring boot";
	}
	
	
	@RequestMapping("/api/num")
	public int getNum() {
		return 100;
	}
}
