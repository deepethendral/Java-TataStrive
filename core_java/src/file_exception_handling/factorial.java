package file_exception_handling;
//factorial 
  import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("enter a no : ");
		
		int n = t.nextInt();
		int fact = 1;
		for(int i = 1; i<=n; i++){
			
			fact = fact*i;
			
		}
		t.close();
		System.out.println("the factorial of given no : " +fact);
	
		
	}

}


/*// celcius to fahernheit
  import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("enter a no : ");
		int fahrenheit  = t.nextInt();
		double celcius = (fahrenheit - 32)*(5.0/9);
		System.out.println("the values for convertin fehernheit to celcius is :"+celcius + " F");
		
		
		
		}
		*/

	




