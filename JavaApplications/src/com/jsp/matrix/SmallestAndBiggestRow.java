package com.jsp.matrix;

public class SmallestAndBiggestRow {

	public static void main(String[] args) {
		  int a[][] = {
		            {10, 4, 5},
		            {56, 2, 8},
		            {10, 20, 3}
		        };
		        int smallest, largest;
		        for (int i = 0; i < 3; i++) 
		        {
		            smallest = a[i][0];
		            largest = a[i][0];
		            for (int j = 1; j < 3; j++) 
		            {
		                if (a[i][j] > largest)
		                    largest = a[i][j];
		                else if (a[i][j] < smallest)
		                    smallest = a[i][j];
		            }
		            System.out.println("Row " + i + ": smallest=" + smallest + " largest=" + largest);
		        }

	}

}
