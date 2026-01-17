package com.cloud.revice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(101, "s");
		map.put(103, "s");
		map.put(102, "a");
		map.put(105, "s");
		map.put(104, "a");
		map.put(105, "a");
		
		System.out.println(map);
		
		map.remove(101);
		
		map.get(102);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
//		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
//			keyType key = entry.getKey();
//			valType val = entry.getValue();
//			
//		}
		
		map.forEach((k,v)->System.out.println(k+":"+v));
		
	}
}
