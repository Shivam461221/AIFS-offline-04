package com.cloud.uncheked;

import java.util.Iterator;

public class ArrayIOB {

	

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		ArrayIOB obj = new ArrayIOB();

		try {
			
			for(int i = 0; i<=arr.length;i++) {
				if(i<arr.length) {
					System.out.println(arr[i]);	
				}
				else {
					throw new Custom("Error");
				}
			}
		} catch (Custom e) {
			System.out.println(e.getMessage());
		}

	}
}
