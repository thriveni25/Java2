package com.jsp.stringspack;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		
		String str = "bananas";
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(!result.contains(String.valueOf(str.charAt(i)))) {
				
				result += str.charAt(i);
			}
		}
		
		System.out.println(result);
	}

}
