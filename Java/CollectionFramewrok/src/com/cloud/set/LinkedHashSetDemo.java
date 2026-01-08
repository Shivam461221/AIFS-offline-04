package com.cloud.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> list = new LinkedHashSet<>();

		list.add(12);

		list.add(10);

		list.add(10);

		list.add(13);

		list.add(15);

		list.add(null);

		list.add(null);
		
		list.remove(null);
		
		
		System.out.println(list);
	}
}
