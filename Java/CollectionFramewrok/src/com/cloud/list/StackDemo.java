package com.cloud.list;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> list = new Stack<>();
		
		list.push(12);
		
		list.push(13);
		
		list.push(14);
		
		System.out.println(list);
		
		System.out.println(list.peek());
		
		list.pop();
		
		System.out.println(list);
	}
}
