import java .util.Scanner;
public class vowels_switchcase {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String s1 = t.nextLine();
		int a=0, e=0,i=0,o=0,u=0;
		for(int y=1; y<s1.length(); y++) { 
			switch (s1.charAt(y)) {
			case 'a':
				a++;
			case 'e':
				e++;
			case 'i':
				i++;
			case 'o':
				o++;
			case 'u':
				u++;
			t.close();
				
			}
			
		}
		System.out.println("a count: " +a);
		System.out.println("e count: " +e);
		System.out.println("i count: " +i);
		System.out.println("o count: " +o);
		System.out.println("u count: " +u);
		
	}
	

}
