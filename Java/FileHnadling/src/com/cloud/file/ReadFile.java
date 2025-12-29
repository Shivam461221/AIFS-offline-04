package com.cloud.file;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
	
	
	public static void main(String[] args) {
		
		
//		File file = new File("C:\\AIFS-offline-04\\Java\\hello.txt");
//		
//		System.out.println(file.exists());
//		
//		System.out.println(file.getName());
//		
//		System.out.println(file.getAbsolutePath());
		
		try {
			FileReader reader = new FileReader("C:\\AIFS-offline-04\\Java\\hello.txt");
			
			int ch;
			while((ch=reader.read())!= -1) {
				System.out.print((char) ch);
			}
			reader.close();
			
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
		
	}
}
