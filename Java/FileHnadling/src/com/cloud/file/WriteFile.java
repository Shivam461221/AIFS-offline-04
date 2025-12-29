package com.cloud.file;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("C:\\AIFS-offline-04\\Java\\new.txt");
			writer.write("Hello IO \n");

			writer.write("This is new line");
			writer.close();

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
}
