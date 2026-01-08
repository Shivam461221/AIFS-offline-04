package com.cloud.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,12,61,1,3));
		
		System.out.println("ArrayList: "+ num);
		
		TreeSet<Integer> list = new TreeSet<>(num);
		
//		list.add(12);
//
//		list.add(10);
//
//		list.add(10);
//
//		list.add(13);
//
//		list.add(15);
//
//		//list.add(null);
//
//		//list.add(null);
//		
//		//list.remove(null);
		
		
		System.out.println(list);
	}
}
