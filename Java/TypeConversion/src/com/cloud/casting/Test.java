package com.cloud.casting;

public class Test {
	
	public static void main(String[] args) {
		
		byte n = (byte) 128;
		
		System.out.println(n);
		
		int x = 100;
		System.out.println("x: "+x);
		
		//Implicit type casting
		long y = x;
		
		System.out.println("y: "+y);
		
		
		//Explicit type casting
		byte z = (byte) x;
		
		long mobile = 97651212122l;
		
		System.out.println(mobile);
		
		int copyMobile =(int) mobile;
		
		System.out.println(copyMobile);
		
		char ch = 'A';
		
		int num = ch;
		
		char sh = (char) x;
		
		System.out.println(sh);
		
		
		System.out.println(num);
		
	}
}
