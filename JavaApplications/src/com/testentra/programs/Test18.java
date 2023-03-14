package com.testentra.programs;
import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		int n= scn.nextInt();
		
		if(n<0) {
			System.out.println(n+"is Negative number");
		}
		else {
			System.out.println(n+"is Positive number");
		}

	}

}
