package Simple_java_program;
import java.util.Scanner;
public class palindrom_str{
public static Boolean ispalindrom(int n) {
	int org = n;
	int rev = 0;
	
	while(n>0)
	{
		int digit = n%10;
		 rev = rev*10+digit;
		n = n/10;
	}
	return org == rev;
}
 public static void main(String[] args) {
	Scanner t = new Scanner(System.in);
	int n = t.nextInt();
	
	if(ispalindrom(n))
	{
		System.out.println("palindrom");
	}
	else
	{
		System.out.println("no");
	}
	t.close();
			}
}

		
		