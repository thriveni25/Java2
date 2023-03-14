package com.jsp.programs;
import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a num");
	int  n =scan.nextInt();
	int m=0;
	int sum=0;
	int count=0;
	 while(n>0)
	 {
		 m=(m*10)+(n%10);
		 if(count<3)
		 {
			sum+=n%10;
			count++;
		 }
			 n/=10;
		 
		
	 }
	 System.out.println(m);
		 System.out.println(sum);
	 }
	
}
