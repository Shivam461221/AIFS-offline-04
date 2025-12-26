package com.cloud.abstraction;

public class Main implements Safety {

	@Override
	public void show() {
		System.out.println("Safety methods");
		
	}
	
	public static void main(String[] args) {
		Safety s = new Main();
		
		s.show();
		
		System.out.println(Safety.name);
	}
	
}
