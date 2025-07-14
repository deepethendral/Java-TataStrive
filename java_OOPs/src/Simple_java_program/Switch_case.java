package Simple_java_program;
import java.util.Scanner;
public class Switch_case {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String s = t.next();
		char grade = s.charAt(0);
		switch(grade) {
		case 'A':
			System.out.println("1st cls");
		break;
		case 'B':
			System.out.println("2nd cls");
		break;
		case 'C':
			System.out.println("3rd cls");
		break;
		case 'D':
			System.out.println("lower");
			default:
				System.out.println("fail");
			}
		t.close();
		

	}

}
