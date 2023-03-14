package com.testentra.programs;
import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter a runs:");
		int r= scn.nextInt();
		if(r>1&&r<=25) {
			System.out.println("Bad performance");
		}
		else if(r>25&&r<50) {
			System.out.println("Good performance");
		}
		else if(r>=50&&r<=80){
			System.out.println("Very Good performance");
		}
		else {
			System.out.println("Amazing performance");
		}

	}

}
