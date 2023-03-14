package com.jsp.stringspack;

public class ReverseLettersInWords {

	public static void main(String[] args) {
        String s="java ia an oop lang";
        String s1=" ";
        char[] a=s.toCharArray();
        int i1=0,j1=0;
        while(j1<a.length) {
        	while(j1<a.length && a[j1]!=' ') j1++;
        	String t="";
        	int k=j1-1;
        	while(k>=i1) {
        		t+=a[k];
        		k--;
        	}
        	s1+=t;
        	if(j1<a.length) s1+=" ";
        	j1++;
        	i1=j1;	
        }
        System.out.println(s1);

	}

}
