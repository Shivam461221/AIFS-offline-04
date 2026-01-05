package com.cloud.casting;

public class PrimitiveToString {
	
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println(x+10);
		
		String str = Integer.toString(x);
		
		System.out.println(str+10);
		
		String str2 = "123";
		
		try {
			int num = Integer.parseInt(str2);
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Alphabets cannnot convert to numbers");
		}
		
		
		
		
		
	}
}
