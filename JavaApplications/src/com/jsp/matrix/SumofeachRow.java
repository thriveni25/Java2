package com.jsp.matrix;

public class SumofeachRow {

	public static void main(String[] args) {
		  int rows, cols, sum;
	        int a[][] = {
	                        {1, 2, 3},
	                        {4, 5, 6},
	                        {7, 8, 9}
	        };
	        rows = a.length;
	        cols = a[0].length;
	        for(int i = 0; i < rows; i++)
	        {
	            sum=0;
	            
	            for(int j = 0; j < cols; j++)
	            {
	                sum = sum + a[i][j];
	            }
	 
	            System.out.println("Sum of elements of row "+(i+1)+": "+sum);
	        }

	}

}
