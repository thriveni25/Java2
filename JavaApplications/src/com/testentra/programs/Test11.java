package com.testentra.programs;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=scn.nextInt();
		
		String s1=a<0?"NEGATIVE":"POSITIVE";
		System.out.println(s1);

		String s2=a%2==0?"EVEN":"ODD";
		System.out.println(s2);
	}

}
