package com.java.inheritance;

import java.util.Scanner;

class Factorial
{
   public int factorial(int num)
    {
	int fact=1;
	for(int i=1;i<=num;i++) fact=fact*i;
	return fact;
	}
}
class Strong extends Factorial
{
	public int Strong(int num)
	{
	int result=0;
	while(num!=0)
	{
		int rem=num%10;
		result=result+factorial(rem);
		num=num/10;
		factorial(num);
	} 
	return result;
	}
}
public class Strongnum {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("number");
    int number=scan.nextInt();
    if (number<0) System.out.println("no negative");
    else
    {
    	Strong s=new Strong();
    	int result=s.Strong(number);
    	if(result==number) System.out.println("strong");
    	else System.out.println("not strong");
    }
	}

}
