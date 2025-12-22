package com.cloud.single;

public class Child extends Parent {
	String name;
	
	public Child(String name, String name2) {
		super(name);
		this.name = name2;
		System.out.println("Child constructor");
	}
	
	
	@Override
	void display() {
		System.out.println("Child Class name "+ name);
		System.out.println("Parent class name: "+super.name);
		super.display();
	}
}
