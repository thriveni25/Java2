package com.jsp.stringspack;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "Java is easy";
		  String s2="";
	        for(int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') {
	                s2+=ch;
	            }
	        }
	 
	        System.out.println("consonants : " +s2);
	}

}
