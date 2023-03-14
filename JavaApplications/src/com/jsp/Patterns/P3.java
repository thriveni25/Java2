																																																package com.jsp.Patterns;

public class P3 {

	public static void main(String[] args) {
		int size =5;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <5; j++) {
				if (j==0 || (i == size-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}

}
