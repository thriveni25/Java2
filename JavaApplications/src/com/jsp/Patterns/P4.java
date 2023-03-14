package com.jsp.Patterns;

public class P4 {

	public static void main(String[] args) {
		 int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
	}
}
