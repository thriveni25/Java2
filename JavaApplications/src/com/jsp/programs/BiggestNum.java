package com.jsp.programs;
import java.util.Scanner;

public class BiggestNum {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=scn.nextInt(); 
       int biggest=0;
       int d=0;
       while(n>0)
       {
    	 d=n%10;
    	n/=10;
    	biggest=Math.max( d, biggest);
       }
       
       System.out.println(biggest+ "is biggest number");
    	   
	}

}
