package com.testentra.programs;
import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		char c= scn.next().charAt(0);
		
		
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			System.out.println(c+"is Alphabet");
		}
		else if(c>='0'&&c<='9'){
			System.out.println(c+"is Number");
		}
		else {
			System.out.println(c+"is Special Character");
		}
	}

}
