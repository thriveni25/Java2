package com.jsp.programs;
import java.util.Scanner;
public class Strong {
	public static void main(String[] args)
	{
    Scanner scan= new Scanner(System.in);
	System.out.println("enter ");
    int n=scan.nextInt();
    int num=n;
    int sum=0;
    while(n>0)
    {
    	int d=n%10;
    	int fact=1;
    for(int i=1;i<=d;i++)
    {
    	fact=fact*i;
    }
    sum+=fact;
    n/=10;
    }
	if (sum==num)
	{
		System.out.println("strong");
	}
	else
	{
		System.out.println("not strong");
	}
    }
	}


