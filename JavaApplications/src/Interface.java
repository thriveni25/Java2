interface I1
{
	void m1();
	void m2();
}
interface I2 extends I1
{
	void m1();
	void m3();
}
class C extends Object implements I1,I2
{
	@Override
	public void m1()
	{
		System.out.println("m1() implements");
	}
	public void m2()
	{
		System.out.println("m2() implements");
	}
	public void m3()
	{
		System.out.println("m3() implements");
	}
}
public class Interface {

	public static void main(String[] args) 
	{ 
		I2 i2= new C();
		i2.m1();
		i2.m2();
		i2.m3();
      
	}

}
