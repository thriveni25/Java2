package logicalpackage;
import java.util.regex.*;
import java.util.Scanner;
public class REPhnNum {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a num: ");
	String PhnNum=scn.next();
	Pattern p=Pattern.compile("[6-9][0-9]{9}");
	Matcher m= p.matcher (PhnNum);
	if (m.find())
	{
	System.out.println("valid");	
	}
	else {
		System.out.println("invalid");
	}

	}

}
