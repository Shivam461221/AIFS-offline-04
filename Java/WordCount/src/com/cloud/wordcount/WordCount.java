package com.cloud.wordcount;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordCount {
	
	public static void main(String[] args) throws IOException{
		String filePath = "C:\\AIFS-offline-04\\Java\\input.txt";
		
		String symbolsFile = "C:\\AIFS-offline-04\\Java\\symbols.txt";
		
		String stopwordFIle = "C:\\AIFS-offline-04\\Java\\stopwords.txt";
		
		System.out.println("-----------------Input File-----------------------");
		String inputData = FileOperations.getInputFile(filePath);
		System.out.println(inputData);
		
		System.out.println("-----------------Without symbols-----------------------");
		String dataWithoutSymbols = DataOperation.removeSymbols(inputData, symbolsFile);
		System.out.println(dataWithoutSymbols);
		
		System.out.println("-----------------Without Stopwords-----------------------");
		String dataWithoutStopwords = DataOperation.removeStopwords(dataWithoutSymbols, stopwordFIle);
		
		System.out.println(dataWithoutStopwords);
		
		
		System.out.println("-----------------Unique words List-----------------------");
		TreeSet<String> uniqueWords = UserOperation.uniqueWords(dataWithoutStopwords);
			
		for(String string: uniqueWords) {
			System.out.println(string);
		}
		
		System.out.println("-----------------Unique words count-----------------------");
		System.out.println(uniqueWords.size());
		
		
		System.out.println("-----------------Unique words with Frequency-----------------------");
		TreeMap<String , Integer> map = UserOperation.wordCount(dataWithoutStopwords);
		
		map.forEach((key, value)-> System.out.println(key+" : "+value));
		
		System.out.println("-----------------Alphabets Frequency-----------------------");
		TreeMap<Character , Integer> charlist = UserOperation.charCount(dataWithoutStopwords);
		
		charlist.forEach((key, value)-> System.out.println(key+" : "+value));
		
//		ArrayList<Character> symbols = FileOperations.readSymbols(symbolsFile);
//		
//		System.out.println(symbols);
//		
//		ArrayList<String> stopwords = FileOperations.readStopwords(stopwordFIle);
//		
//		System.out.println(stopwords);
//		
//		System.out.println(stopwords.size());
		
	}
}
