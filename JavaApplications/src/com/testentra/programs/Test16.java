package com.testentra.programs;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		int n= scn.nextInt();
		
		if(n%6==0) {
			System.out.println(n+"is multiple of 6");
		}
		else {
			System.out.println(n+"is not multiple of 6");
		}
		


	}

}
