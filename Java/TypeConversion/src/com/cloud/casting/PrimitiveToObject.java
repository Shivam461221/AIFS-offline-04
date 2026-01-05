package com.cloud.casting;

public class PrimitiveToObject {
		public static void main(String[] args) {
			//int - Integer
			//byte - Byte
			//char - Character
			
			int x = 10;
			
			Integer y = x;  //auto-boxing
			
			Integer z = Integer.valueOf(x);
			
			Double a = Double.valueOf(x);
			
			
		}
}
