package file_exception_handling;

public class arithemeticexception {
	public static void main(String[] args) {
		try {
			int i = 5/0;
			System.out.println("there is an error" +i);
		}
		catch(ArithmeticException e) {
			System.out.println("there is an error" + e.getMessage());
			e.printStackTrace();
		}
	}

}
