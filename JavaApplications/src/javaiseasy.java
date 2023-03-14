
public class javaiseasy {
   public static void print(int num) {
	   if(--num<0) return;
	   System.out.println("JAVA IS EASY");
	   print(num);
   }
	public static void main(String[] args) {
      print(5);
	}

}
