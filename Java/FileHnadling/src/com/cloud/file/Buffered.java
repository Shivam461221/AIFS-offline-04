package com.cloud.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered {
	
	public static void main(String[] args) {
		
//		try {
//			//FileReader reader = new FileReader("");
//			BufferedReader reader = new BufferedReader(new FileReader("C:\\AIFS-offline-04\\Java\\hello.txt"));
//			
//			String data;
//			
//			while((data=reader.readLine())!=null) {
//				System.out.println(data);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		try {
			//FileReader reader = new FileReader("");
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\AIFS-offline-04\\Java\\data2.txt"));
			
			writer.write("New file");
			
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
