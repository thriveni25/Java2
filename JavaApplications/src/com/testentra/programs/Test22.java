package com.testentra.programs;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a num:");
		int n= scn.nextInt();
		int m= scn.nextInt();
		int o= scn.nextInt();
		int sum=0;
		sum+=n+m+o;
		if(sum>50) {
		System.out.println("the sum is greater than 50");
		}
		else {
			System.out.println("the sum is less than 50");
		}
	}

}
