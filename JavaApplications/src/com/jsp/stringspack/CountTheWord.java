package com.jsp.stringspack;


      public class CountTheWord {
	  public static void main(String[]args) {
		 String str=" hi java world";
		 int count=0;
		 for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
        	count++;
        	             }
			
			}
		 System.out.println("number of words in string:"+count);

         }}
