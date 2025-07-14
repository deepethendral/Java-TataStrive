package Simple_java_program;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int a = t.nextInt();
		int b = t.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		t.close();
	}

}

