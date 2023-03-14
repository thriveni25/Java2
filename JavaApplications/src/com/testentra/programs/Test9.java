package com.testentra.programs;
import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter l and b :");
		double side=scn.nextDouble();	
 
		double area=side*side;
		double perimeter=4*side;
		System.out.println("Area of square ="+area);
		System.out.println("perimeter of square ="+perimeter);
		 
		
	}

}
