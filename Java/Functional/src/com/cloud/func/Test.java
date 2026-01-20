package com.cloud.func;

public class Test {

	public static void main(String[] args) {
		
		
		Greet greet = ()->System.out.println("Hello ");
		
		greet.show();
		
		//Calculation obj1 = (a,b)->a+b;
		
		//System.out.println(obj1.add(10, 20));
		
		Calculation obj1 = (a)->a*a;
		
		System.out.println(obj1.square(5));
		
		
	}

}
