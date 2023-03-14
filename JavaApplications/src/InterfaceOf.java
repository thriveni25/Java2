class A{	
}
class B extends A{
}
public class InterfaceOf {

	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
	}

}
