package com.jsp.stringspack;

public class UpperString {

	public static void main(String[] args) {
		String s1="abcdefg@123";
		String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<'z')
			{
				s2+=(char)(s1.charAt(i)-32);
			}
			else {
				s2+=s1.charAt(i);
			}
		}
        System.out.println(s2);
	}

}
