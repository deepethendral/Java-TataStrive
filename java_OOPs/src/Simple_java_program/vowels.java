package Simple_java_program;
import java .util.Scanner;
public class vowels {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String s1  = t.nextLine();
		 int a= 0;
		 int e=0;
		 int i=0;
		 int o=0;
		 int u=0;
		 for(int y=1; y<s1.length(); y++) {
			 
			 if(s1.charAt(y)=='a') {
				 a++;
			 }
			 else if(s1.charAt(y) =='e') {
				 e++;
			 }
			 else if(s1.charAt(y)=='i') {
				 i++;
			 }
			 else if(s1.charAt(y)=='o') {
				 o++;
			 }
			 else if(s1.charAt(y)=='u') {
				 u++;
			 }
			 t.close();
		 }
			 System.out.println("a count: " +a);
			 System.out.println("e count: " +e);
			 System.out.println("i count: " +i);
			 System.out.println("o count: " +o);
			 System.out.println("u count: " +u);
				 
		 
		
		// TODO Auto-generated method stub

	}

}

