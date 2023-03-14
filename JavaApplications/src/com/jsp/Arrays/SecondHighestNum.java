package com.jsp.Arrays;
public class SecondHighestNum {
    public static void sort(int[] a) {
    	for(int i=0;i<a.length-1;i++) {
        	for(int j=0;j<a.length-1-i;j++) {
        	 if(a[j]>a[j+1]) {
        		 int temp=a[j];
        		 a[j]=a[j+1];
        		 a[j+1]=temp;
        	 }
        	}
    	}
        }
      public static void main(String[] args) {
      int [] a= {1,2,3,4,5};
    	  for(int i=0;i<a.length-1;i++) {
          	for(int j=i+1;j<a.length;j++) {
          		if(a[i]==a[j]) a[j]=0;
          	}
    	  }
          sort(a);
    	  System.out.println(a[a.length-3]);
}
}
