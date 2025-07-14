package Simple_java_program;

import java.util.Scanner;

public class palindrom {
	public static boolean ispalindrom(int n) {
		
		int org = n ;
		int rev= 0;
		
		while( n!= 0) {
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		return org == rev;
					
	}
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		if(ispalindrom(n))
		{
			System.out.println("it is a palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
		sc.close();
		
	}
	
}
