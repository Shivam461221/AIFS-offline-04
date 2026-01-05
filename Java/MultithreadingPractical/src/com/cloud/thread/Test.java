package com.cloud.thread;

public class Test {
	
	public void print(String name) {
		for(int i = 1; i<=10; i++) {
			System.out.println(name+" count: "+i);
		}
	}
	public static void main(String[] args) {
		
		
		Test t1 = new Test();
		
		t1.print("one");
		t1.print("two");
	}
}
