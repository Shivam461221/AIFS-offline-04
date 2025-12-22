package com.cloud.single;

public class Parent {
	
	String name;
	
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent constructor");
	}
	
	void show() {
		System.out.println("Parent class method");
	}
	
	void display() {
		System.out.println("Parent class method");
	}
}
