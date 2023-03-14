package com.jsp.matrix;

public class Transpose {

	public static void main(String[] args) {
		   int a[][] = { {10, 22, 33}, 
                   {44, 55, 66}, 
                   {77, 88, 99} 
                 };
int transpose[][] = new int[3][3];  

for (int i = 0; i < 3; i++) 
{
   for (int j = 0; j < 3; j++) 
   {
       transpose[i][j] = a[j][i];
 
       System.out.print(transpose[i][j] + " ");
   }
   System.out.println();
}
	}

}
