package com.jsp.Arrays;

public class SelectionSorting {

	public static void main(String[] args) 
	{
		int[] a= {3,5,6,7,8,9,2,3};
		sort(a);
		for(int n:a)  System.out.println(n);
	}
     public static void sort(int[] a) {
    	 for(int i=0;i<a.length-1;i++)
    	 {
    		 int index=i;
    		 for(int j=i+1;j<a.length;j++) {
    			if(a[j]<a[index])  index=j;
    		 }
    		 if(i!=index) {
    			 int t=a[index];
    			 a[index]=a[i];
    			 a[i]=t;
    		 }
    	 }
     }
}
