package com.jsp.matrix;

public class SmallestBiggestin2d {

	public static void main(String[] args) {
        int[][] a = {
                {25, 11, 10, 18},
                {21, 27, 17, 19},
                {13, 14, 30, 20},
                {15, 24, 23, 16}
        };
        int max = a[0][0];
        int min = a[0][0];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max)  max = a[i][j];
               
                if (a[i][j] < min) min = a[i][j];
                
            }
        }
        System.out.println("Smallest number = " + min);
        System.out.println("Biggest number = " + max);
	}
}
