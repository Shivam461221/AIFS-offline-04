package com.cloud.others;

import java.lang.*;

public class Test extends Object{
	
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Name: "+name+" ,age: "+age;
		
	}
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void finalize() {
		System.out.println("Garbage collector run");
	}
	
	public static void main(String[] args) {
		
		
		
		Test obj = new Test("Shivam", 25);
		
		Test obj2 = new Test("Shivam", 25);
		
		System.out.println(obj.getClass());
		
		obj = null;
		
		obj2 = null;
		
		System.gc();
	}

	

}
