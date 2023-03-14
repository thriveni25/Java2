package com.testentra.programs;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a age:");
		int age= scn.nextInt();
		
		if(age<18) {
			System.out.println(" Not Eligible to vote");
		}
		else{
			System.out.println("Eligible to vote");
		}
	}

}
