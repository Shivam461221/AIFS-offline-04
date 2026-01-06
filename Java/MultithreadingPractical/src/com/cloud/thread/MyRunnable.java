package com.cloud.thread;

import java.io.Serializable;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+" Count : "+i);
		}
		
	}
	
	
}
