package com.jsp.copyconstructorpack;
class Rectangle{
	int length;
	int breadth;
    public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(Rectangle r1) {
        this.length=r1.length;
        this.breadth=r1.breadth;
	}
	public Rectangle(Rectangle r2,Rectangle r1) {
		this.length=r2.length;
		this.breadth=r1.breadth;
	}
	public void CalculateArea() {
	     System.out.println("Area of Rectangle is :"+length * breadth);
	}
}
public class RectangleArea {

	public static void main(String[] args) {
      Rectangle r1=new Rectangle(3,7);
      r1.CalculateArea();
      
      Rectangle r2=new Rectangle(8,21);
      r2.CalculateArea();
      
      Rectangle r3=new Rectangle(r1);
      r3.CalculateArea();
      
      Rectangle r4=new Rectangle(r2,r1);
      r4.CalculateArea();
      
      Rectangle r5=new Rectangle(r2,r1);
      r5.CalculateArea();
	}
}