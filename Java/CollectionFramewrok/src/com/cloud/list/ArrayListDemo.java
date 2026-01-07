package com.cloud.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> fruits1 = new ArrayList<>();
		
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Grapes","Tomato"));
		
		fruits.add("Mango");
		
		fruits.add("Banana");
		
		fruits.add("Papaya");
		
		fruits.add("Watermelon");
		
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		fruits.add(2, "Orange");
		
		System.out.println(fruits);
		
		fruits.remove(0);
		
		System.out.println(fruits);
		
		//fruits.clear();
		
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		
		System.out.println(fruits.get(3));
		
		
		
		System.out.println("----------------------------------------");
		
		for(int i = 0; i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
		
		System.out.println("----------------------------------------");
		
		for(String str : fruits) {
			System.out.println(str);
		}
		
		System.out.println("----------------------------------------");
		
		Iterator<String> it = fruits.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(fruits.contains("Mango"));
		
	}	

}
