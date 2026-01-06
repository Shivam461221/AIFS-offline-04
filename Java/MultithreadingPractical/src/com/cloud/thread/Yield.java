package com.cloud.thread;

public class Yield {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " Count : " + i);
				//Thread.yield();
				
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " Count : " + i);
				
				
			}
		});
		
		t1.setName("Thread 1");
		
		t2.setName("Thread 2");
		
		System.out.println(t1.isAlive());
		
		t1.start();
		
		System.out.println(t1.isAlive());
		
		t2.start();
		
		System.out.println(t1.isAlive());
	}

}
