package com.jsp.stringspack;
public class SentenceToWords 
{ 
    public static void main(String[] args) 
    { 
    	String s = "I am java developer, i know java";
    	String s1 = "";
        int count=0;
        int index=0;
    	for(int i = 0; i < s.length(); i++) {
    			if(s.charAt(i)==' ') {
    			count++;
    			}
    	}
    	System.out.println("*****************************");
    	
    	String[] s2= new String[count+1];
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(c!=' ') s1+=c;
    		else {
    			s2[index++]=s1;
    			s1="";
    		}
    	}
    	s2[index]=s1;
    	for(String a:s2) System.out.println(a);
    	
    	
    	String result="";
		for (int i = 0; i < s.length(); i++) {
			if (i == 0)
				result += Character.toUpperCase(s.charAt(i));
			else if (s.charAt(i-1) == ' ')
				result += Character.toUpperCase(s.charAt(i));
			else
				result += s.charAt(i);
		}
		System.out.println("*******************************");
		System.out.println(result);
		System.out.println("****************************");
        
		
		count=0;
		String word="";
		for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.print(count + word + " ");
                word = "";
                count = 0;
            } else {
                word = word + s.charAt(i);
                count++;
            }
        }
		
        System.out.println(count + word);
        System.out.println("****************************");
		
        
         s1=" ";
        char[] a=s.toCharArray();
        int i=a.length-1,j=a.length-1;
        while(j>=0) {
        	while(j>=0 && a[j]!=' ') j--;
        	String t="";
        	int k=j+1;
        	while(k<=i) {
        		t+=a[k];
        		k++;
        	}
        	s1+=t;
        	if(j<a.length) s1+=" ";
        	j--;
        	i=j;	
        }
        System.out.println(s1);
        System.out.println("****************************");

        
        s1=" ";
        char[] a1=s.toCharArray();
        int i1=0,j1=0;
        while(j1<a.length) {
        	while(j1<a.length && a1[j1]!=' ') j1++;
        	String t="";
        	int k=j1-1;
        	while(k>=i1) {
        		t+=a1[k];
        		k--;
        	}
        	s1+=t;
        	if(j1<a1.length) s1+=" ";
        	j1++;
        	i1=j1;	
        }
        System.out.println(s1);
        System.out.println("****************************");  
    } 
}