package com.jsp.stringspack;

public class Ovles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Hello world";
		        int count = 0;
		        for(int i = 0; i < str.length(); i++) {
		            if(str.charAt(i) == 'o' )
		                count++;
		        }
		        System.out.println("Number of ovels in the given string: " + count);
		    }
		}
	
