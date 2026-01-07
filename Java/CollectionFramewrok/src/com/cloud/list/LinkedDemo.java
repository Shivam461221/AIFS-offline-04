package com.cloud.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(12);
		
		list.add(15);
		
		list.addFirst(10);
		
		list.addLast(20);
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		list.removeLast();
		
		System.out.println(list);
		
		
		//List<Integer> list2 = new ArrayList<>();
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
