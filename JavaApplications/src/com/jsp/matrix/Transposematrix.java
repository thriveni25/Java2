package com.jsp.matrix;

public class Transposematrix {

	
	
	public static void main(String[] args) {
		int row=3,col=3;
	        int [][] a = { {1, 2, 3}, 
	                      {4, 5, 6}, 
	                      {7, 8, 9} 
	                    };
	        display(a);
	    int [] [] transpose=new int[col][row];
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) {
	    		transpose[j][i]=a[i][j];
	    	}
	    }
	    display(transpose);
	}
	    private static void display(int[][] a) {
	    	System.out.println("the matrix is:");
			int[] row = null;
			for (int col: row) {
	    		System.out.println(col+" ");
	    	}
		      System.out.println();
	}
		
}	
	    

	

