package com.cloud.wordcount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("Shivam", 100);
		map.put("Neha", 110);
		map.put("Surbhi", 150);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		for(Map.Entry<String, Integer> entry: list) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
