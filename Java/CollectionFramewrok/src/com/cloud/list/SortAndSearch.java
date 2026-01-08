package com.cloud.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortAndSearch {
	public static void main(String[] args) {
		
		
ArrayList<String> list = new ArrayList<>();
		
		
		list.add("Neha");
		list.add("Tushar");
		
		list.addAll(1, Arrays.asList("Surbhi", "Tarkit", "Ayush"));
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		Collections.sort(list);  //sorting in Natural order
		
		//Collections.reverse(list);  //Reverse the order
		
		//Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list.get(0));
		
		System.out.println(list);
		
		int index = Collections.binarySearch(list, "Ayush");
		
		System.out.println(index);
		
	}
}
