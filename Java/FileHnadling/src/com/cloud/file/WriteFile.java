package com.cloud.file;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Write your content");
		String data = sc.nextLine();

		try {
			FileWriter writer = new FileWriter("C:\\AIFS-offline-04\\Java\\new.txt");
			writer.write(data);
			writer.close();

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
		
		sc.close();
	}
}
