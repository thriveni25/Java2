package logicalpackage;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternMacher {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a{1,}");
		Matcher m=p.matcher("aaaaaaaaahu1aju7a1a2ajn");
		while(m.find())
		{
			System.out.println("start = "+m.start());
			System.out.println("end = "+m.end());
			System.out.println("group = "+m.group());
			System.out.println("---------------------");
		}
	}

}
