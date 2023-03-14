package com.testentra.programs;

import java.util.Scanner;

public class Test21 {
	// 
	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		String s=scn.nextLine();
	
		 char c =s.charAt(0);
		
		if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("vowels");
		}
		else if((c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')&&(c>='A'&&c<'Z')) {
			System.out.println("consonents");
		}
		else if(c>'0'&&c<'9'){
			System.out.println("numbers");
		}
		else {
			System.out.println("special character");
		}

	}

}
