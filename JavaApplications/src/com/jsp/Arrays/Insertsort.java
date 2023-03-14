package com.jsp.Arrays;

public class Insertsort {

	public static void main(String[] args) {
		int[] a= {3,5,6,4,1,9,7,8};
		sort(a);
		for(int n:a) System.out.print(n+" ");
		System.out.println();
	}
    public static void sort(int[] a) {
    	for(int i=1;i<a.length;i++) {
    		int key=a[i];
    		int j=i-1;
    		while(j>-1 && a[j]>key) {
    			a[j+1]=a[j];
    		    j--;
    	}
    		a[j+1]=key;
    	
    }
    	
			
		
		

	}

}
