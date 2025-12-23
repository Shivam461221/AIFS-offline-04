package com.cloud.vehicle;

import java.util.Scanner;

public class VehicleManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vehicle vehicle = null;

		while (true) {
			System.out.println("\n-----Welcome to VMS-----");
			System.out.println("1: create car");
			System.out.println("2: create bike");
			System.out.println("3: show vehicle details");
			System.out.println("4: calculate tax");
			System.out.println("5: Exit");
			System.out.println("Enter your choice");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				vehicle = new Car("Toyota", 1200000, new Engine("Diesel", 200));
				System.out.println("Car created");
				break;
			case 2:
				vehicle = new Bike("Bajaj", 120000, new Engine("Petrol", 20));
				System.out.println("Bike created");
				break;
			case 3:
				vehicle.showVehicleDetails();
				break;
			case 4:
				System.out.println("Tax: " + vehicle.calculateTax());
				break;
			case 5:
				System.out.println("Exiting.....");
				return;
			default:
				System.out.println("Invalid Choice");
			}

		}
	}
}
