package com.jsp.overloadingpack;

class Rectangle{
	int length;
	int breadth;
	
	public Rectangle() {
		length=5;
		breadth=6;
	}
   public Rectangle(int num) {
	   length=num;
	   breadth=num;
   }
   public Rectangle(int length,int breadth) {
	 this.length=length;
	 this.breadth=breadth;
   }
   public void calculateArea() {
	   System.out.println("The area of rectangle is: "+ length*breadth);
   }
}

public class RectangleClass {

	public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        
        Rectangle r2 = new Rectangle(7);
        r2.calculateArea();
        
        Rectangle r3 = new Rectangle(3,6);
        r3.calculateArea();
        
	}

}
