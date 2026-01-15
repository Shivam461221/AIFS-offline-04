package com.cloud.wordcount;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class UserOperation {

	public static TreeSet<String> uniqueWords(String inputFile) throws IOException {

		String[] str = inputFile.split(" ");

		ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

		TreeSet<String> unique = new TreeSet<>(list);

		return unique;
	}

	public static TreeMap<String, Integer> wordCount(String inputFile) throws IOException {

		String[] str = inputFile.split(" ");

		ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(String string: list) {
			map.put(string, Collections.frequency(list, string));
		}
		
		return map;
	}
	
	public static List<Map.Entry<String, Integer>> wordCountDescending(String inputFile) throws IOException {

		String[] str = inputFile.split(" ");

		ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(String string: list) {
			map.put(string, Collections.frequency(list, string));
		}
		
		List<Map.Entry<String , Integer>> mapList = new ArrayList<>(map.entrySet());
		
		mapList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		return mapList;
	}
	
	public static TreeMap<Character, Integer> charCount(String inputFile) throws IOException{
		String data = inputFile.replace(" ", "");
		
		char[] ch = data.toCharArray();
		
		ArrayList<Character> charList = new ArrayList<>();
		
		for(Character character: ch) {
			charList.add(character);
		}
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		
		for(int i = 97; i<=122; i++) {
			int frequency = Collections.frequency(charList, (char) i);
			map.put((char) i, frequency);
		}
		
		for(int i = 65; i<=90; i++) {
			int frequency = Collections.frequency(charList, (char) i);
			map.put((char) i, frequency);
		}
		
		return map;
	}

}
