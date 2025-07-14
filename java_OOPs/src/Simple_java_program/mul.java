package Simple_java_program;
import java .util.Scanner;
public class mul {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		for( int i=1; i<n; i++) {
			if(i%2==0) {
				System.out.println(" welcome to java");
			}
			if(i%3==0) {
				System.out.println("thank u");
			}
			t.close();
		}
		
		

	}

}
