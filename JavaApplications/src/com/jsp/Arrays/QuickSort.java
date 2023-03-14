package com.jsp.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int [] a= {5,10,2,7,6,4,8,3,1};
		sort(a,0,8);
		for(int n:a) System.out.print(n+" ");
		System.out.println();
	}
	public static void sort(int[] a,int start,int end) {
		if(start>=end) return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}

}