package com.jsp.Arrays;

public class Array {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		String s="";
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			s+=a[i];
			if(i<a.length) s+="+";
			
		}
         s=s+"="+sum;
         System.out.println(s);
	}

}
