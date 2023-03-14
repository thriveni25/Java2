package logicalpackage;
import java.util.regex.*;
import java.util.Scanner;

public class REPassword {

	public static void main(String[] args) {
		
		
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a password: ");
			String Password=scn.next();
			Pattern p=Pattern.compile("(?=.*[!@#$%^&*_+-~])(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9]).{6,10}");
			Matcher m= p.matcher (Password);
			if (m.find())
			{
			System.out.println("valid");	
			}
			else {
				System.out.println("invalid");
			}

			}

		}

	
