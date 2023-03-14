package com.jsp.stringspack;
public class MaxOccurance {
	   public static void main(String[] args) {
	      String s = "zzygtraa";
	      String s2;
	      int count=0;
	      char ch1=s.charAt(0);
	      
	      while(s.length()>0) {
	    	char ch2=s.charAt(0);
	    	s2=s.replace(ch2+"","");
	    	int l=s.length()-s2.length();
	    	if(l>count) {
	    		count=l;
	    		ch1=ch2;
	    	}
	    	s=s2;
	      }
	      System.out.println(ch1+"-"+count);
	   }
	}