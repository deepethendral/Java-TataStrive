package java_Demo;
import java.util.regex.*;


class regularexp{
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);
		
		boolean b1 = Pattern.compile(".as").matcher("ass").matches();
		System.out.println(b1);
		
		boolean b2 = Pattern.matches(".ss" , "ass");
		System.out.println(b2);
		
		
		
	}
}










