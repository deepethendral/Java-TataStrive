package Simple_java_program;
import java.util.Scanner;
public class If_else {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String s = t.next();
		char grade = s.charAt(0);
		if(grade == 'A')
		{
			System.out.println("1st cls");
		}
		else if (grade == 'B')
		{
			System.out.println("2nd cls");
		}
		else {
			System.out.println("3rd cls");
		}
		t.close();
	}}
		
		
		