package com.cloud.thread;

public class Main {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		t1.setName("Thread 1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("Thread 2");
		t2.start();
		
		MyThread t3 = new MyThread();
		t3.setName("Thread 3");
		t3.start();
	}
}
