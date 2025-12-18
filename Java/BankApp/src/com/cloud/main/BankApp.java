package com.cloud.main;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount account = new BankAccount("Shivam", 15000);

		int choice;

		do {
			System.out.println("Welcome to cloud bank");
			System.out.println("Press 1 to display balance");
			System.out.println("Press 2 to deposit");
			System.out.println("press 3 to withdraw");
			System.out.println("press 4 to exit");
			System.out.println("Enter yout choice");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your current balance is: " + account.getBalance());
				break;

			case 2:
				System.out.println("Please insert amount");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				System.out.println("Please insert amount");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;

			case 4:
				System.out.println("Thank you for using cloud bank service");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);
		
		sc.close();
		
	}
}
