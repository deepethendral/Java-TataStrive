package file_exception_handling;

/*// reverse an array
 * import java.util.Scanner;
public class reverse{
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		int [] arr = new int[n];
		 for(int i=0; i<n; i++) {
			 arr[i] = t.nextInt();
		  }
			
		for(int i=n-1; i>=0; i--) 
		{
			System.out.println(arr[i]);
		}
	}
}
*/

//triangle
public class reverse{
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		
	
