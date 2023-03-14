package com.jsp.stringspack;

public class LengthOfString {

	public static void main(String[] args) {
		String s="java is a oop language";
		char[] a=s.toCharArray();
		int count = 0;
		for(char c:a) {
			count++;
		}
		             
		System.out.println(count); 

	}
	
}
