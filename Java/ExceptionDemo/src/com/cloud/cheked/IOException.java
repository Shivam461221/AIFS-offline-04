package com.cloud.cheked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class IOException {
	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("");
			
			int ch;
			
			while((ch=reader.read())!=-1) {
				System.out.print((char) ch);
			}
			
		}
		
		catch(java.io.IOException e) {
			System.out.println(e);
		}
		
		finally {
			
		}
	}
}
