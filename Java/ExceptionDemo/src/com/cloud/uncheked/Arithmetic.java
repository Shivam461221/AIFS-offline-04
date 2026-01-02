package com.cloud.uncheked;

public class Arithmetic {
	
	public static void main(String[] args) {
		System.out.println("start");
		int a=10;
		
		int b=0;
		
		try {
			System.out.println(a/b);
		}
		
		catch(ArithmeticException e) {
			System.out.println("You can nt divide by zero ");
		}
		
		
		System.out.println("Ending");
	}
}
