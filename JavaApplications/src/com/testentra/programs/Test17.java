package com.testentra.programs;
import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		int n= scn.nextInt();
		
		if(n%2==0) {
			System.out.println(n+"is even");
		}
		else {
			System.out.println(n+"is odd");
		}

	}

}
