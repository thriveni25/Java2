package com.jsp.cardevelopment;

public class ClassDevelopEngine {

	public static void main(String[] args) {
		Driver driver1=new Driver();
		driver1.driver(new Audi());
		System.out.println("***************");
		driver1.driver(new Swift());
		System.out.println("***************");
		driver1.driver(new Bmw());
		System.out.println("***************");
		driver1.accessbluetooth(new Swift());

	}

}
