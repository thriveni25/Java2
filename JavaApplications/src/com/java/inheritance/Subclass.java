package com.java.inheritance;
class A{
	public void m1() {
		System.out.println("m1()");
	}
}
class B extends A{
	public void m1() {
		System.out.println("m2()");
	}
}
class C extends B{
	public void m1() {
		System.out.println("m3()");
	}
}
public class Subclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C b=new C();
		b.m1();

	}

}
