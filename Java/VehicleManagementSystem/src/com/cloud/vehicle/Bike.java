package com.cloud.vehicle;

public class Bike extends Vehicle{
	
   //IS-A Relation - tight coupling  
	
	public Bike(String brand, double price, Engine engine) {
		super(brand, price, engine);
	}
	
	double calculateTax() {
		return price*0.05;
	}

}
