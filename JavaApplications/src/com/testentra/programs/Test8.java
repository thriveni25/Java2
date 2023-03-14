package com.testentra.programs;
import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("enter l and b :");
	double len=scn.nextDouble();
	double bre=scn.nextDouble();
	double area=len*bre;
	double perimeter=2*len+bre;
	System.out.println("Area of rectangle"+area);
	System.out.println("perimeter of rectangle"+perimeter);
	
	
	}

}
