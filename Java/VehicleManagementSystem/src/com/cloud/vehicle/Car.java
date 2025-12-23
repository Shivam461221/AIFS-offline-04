package com.cloud.vehicle;

public class Car extends Vehicle {
	
	public Car(String brand, double price, Engine engine) {
		super(brand, price, engine);
	}
	
	@Override
	double calculateTax() {
		return price*.10;
	}
}
