package com.cloud.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1011, "Shivam");

		map.put(102, "Neha");

		map.put(1033, "Tarkit");

		map.put(104, "Ayush");

		map.put(100, "Om");

		System.out.println("HashMap: " + map);

		// map.remove(101);

		// System.out.println(map);

		System.out.println(map.get(104));

		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();

		map2.put(11, "Shivam");

		map2.put(02, "Neha");

		map2.put(033, "Tarkit");

		map2.put(04, "Ayush");

		map2.put(10, "Om");
		
		map2.putAll(map);

		System.out.println("LinkedHashMap: " + map2);

		Map<Integer, String> sorted = new TreeMap<>(map);

		System.out.println("TreeMap: " + sorted);
		
		System.out.println(map.containsKey(1011));
		
		System.out.println(map.containsValue("Shivam"));
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		for (Map.Entry<Integer, String> entry : map2.entrySet()) {
			//Integer key = entry.getKey();
			//String val = entry.getValue();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		System.out.println("----------------------------------------------");
		
		sorted.forEach((key, value)->System.out.println(key+" : "+value));
		
		System.out.println("----------------------------------------------");
		
		for(Integer key: map.keySet()) {
			System.out.println(key +" : "+ map.get(key));
		}

	}
}
