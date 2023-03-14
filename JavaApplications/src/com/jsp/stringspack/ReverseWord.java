
package com.jsp.stringspack;

public class ReverseWord {

	public static void main(String[] args) {
		String s1="I am in Bengalore";
		String s2=" ";
		char[] a=s1.toCharArray();
        int i=a.length-1,j=a.length-1;
        while(j>=0) {
        	while(j>=0 && a[j]!=' ') j--;
        	String t="";
        	int k=j+1;
        	while(k<=i) {
        		t+=a[k];
        		k++;
        	}
        	s2+=t;
        	if(j<a.length) s2+=" ";
        	j--;
        	i=j;	
        }
        System.out.println(s2);
	}

}
