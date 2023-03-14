package com.jsp.Abstractclass;
abstract class A
{
		
	public  static void m1()
	{
		System.out.println(("m1() of class A"));
	}
	public abstract void m2();
	public abstract void m3();
}
class B extends A
{
	public void m2()
	{
		System.out.println("m2() overridden");
	}
	public void m3()
	{
		System.out.println("m3() defined");
	}
	public void m4()
	{
		System.out.println("m4() defined");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		a.m3();
		
		((B)a).m4();
		

	}

}
