package com.cloud.thread;

public class Join {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " Count : " + i);
				
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " Count : " + i);
				
				
			}
		});
		
		t1.setName("Thread 1");
		
		t2.setName("Thread 2");
		
		
		t1.start();
		
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread");
		
	}
}
