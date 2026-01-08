package com.cloud.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		
		list.add("Neha");
		list.add("Tushar");
		
		list.addAll(1, Arrays.asList("Surbhi", "Tarkit", "Ayush", "Neha"));
		
		System.out.println(list);
		
		//System.out.println(list.lastIndexOf("Surbhi"));
		
		//list.set(1, "Anugrah");
		
		System.out.println(list);
		
	//	list.removeAll(Arrays.asList("Anugrah", "Neha"));
		
		System.out.println(list);
		
	//	list.retainAll(Arrays.asList("Neha", "Tarkit"));
		
		System.out.println(list);
		
		list.forEach(s->System.out.println(s));
		
		List<String> list2 =  list.subList(0, 3);
		
		System.out.println(list2);
		
		list.subList(0, 1).clear();
		
		
	}
}
