package com.jsp.stringspack;


public class Demo1 {
	public static void main(String args[]) {
		String s = "aabbcc";
		int max = 0;
		char c = 0;
		int[] arr = new int[26];

		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				c = (char)(i + 'a');
			}
		}
		System.out.println(c + " - " + max);
	}
}