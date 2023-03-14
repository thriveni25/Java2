package com.testentra.programs;

public class Test6 {

	public static void main(String[] args) {
		
		int i=4;
		long l=i;
      System.out.println(i);//widening
      
       short s=1;
       double d=s;
      System.out.println(s);//widening
      
      short a=145;
      byte b=(byte)a;
      System.out.println(b);//narrowing
      
      double d1=1760;
      int i1=(int)d1;
      System.out.println(i1);//narrowing
	}

}