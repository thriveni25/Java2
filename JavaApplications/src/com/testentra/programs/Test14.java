package com.testentra.programs;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		int n1=a>b?a:b;
		System.out.println("Greatest num is:"+n1);
		
		int n2=a<b?a:b;
		System.out.println("Smallest num is:"+n2);
		
		
		
	}

}
