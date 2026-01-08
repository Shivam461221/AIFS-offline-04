package com.cloud.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<>();
		
		list.add(12);
		
		list.add(10);
		
		list.add(10);
		
		list.add(13);
		
		list.add(15);
		
		list.add(null);
		
		list.add(null);
		
		System.out.println(list);
	}
}
