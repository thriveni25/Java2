package com.jsp.stringspack;

public class Encode {

	public static void main(String[] args) {
		   String str = "Apple juice";
	        String encodedStr = "";

	        for (int i = 0; i < str.length(); i++) {
	           
	            encodedStr += (char)(str.charAt(i)+ 3);
	        }
	        System.out.println("Encoded string: " + encodedStr);
		

	}

}
