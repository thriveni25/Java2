package com.jsp.programs;
import java.util.Scanner;
public class Largestdigit {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int biggest=0;
		
		while(n>0)
		{
			int d=n%10;
			if(d>biggest) {
			  biggest=d;
			}
			n/=10;
		}
		System.out.println(biggest+"is the biggest digit");
	}

}
