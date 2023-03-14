package com.testentra.programs;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		int n= scn.nextInt();
		
		if(n>=85) {
			System.out.println("Distinction");
		}
		else if(n>=35 && n<=85) {
			System.out.println("First class");
		}
		else {
			System.out.println("Fail");
		}
	}

}
