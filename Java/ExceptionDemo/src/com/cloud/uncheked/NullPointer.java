package com.cloud.uncheked;

public class NullPointer {
	
	public static void main(String[] args) {
		
		Arithmetic obj = null;
		
		try {
			System.out.println(obj.toString());
		}
		
		catch(NullPointerException e) {
			System.out.println("Your Object is null ");
		}
		
		finally {
			System.out.println("Finally ");
		}
		
	}
}
