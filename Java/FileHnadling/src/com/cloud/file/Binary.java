package com.cloud.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\AIFS-offline-04\\Java\\ShivamResume__Full_Stack (1).pdf");
			FileOutputStream fos = new FileOutputStream("C:\\AIFS-offline-04\\Java\\ShivamResume.pdf");
			
			int ch;
			
			while((ch=fis.read())!=-1) {
				//System.out.print(ch);
				fos.write(ch);
			}
			
			System.out.println("Data copied");
			
		} catch (IOException e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
		}
	}
}
