package com.cloud.vehicle;


public class Vehicle {
	String brand;
	double price;
	
	protected Engine engine; //Has-a relation
	
	
	public Vehicle(String brand, double price, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}
	
	void showVehicleDetails() {
		System.out.println("Vehicle Details: ");
		System.out.println("Brand: "+ brand);
		System.out.println("Price: "+ price);
		engine.showEngineDetails();
	}
	
	double calculateTax() {
		return price*0.15;
	}
	
	
}
