package file_exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
	public static void main(String[] args) {
		try {
			File myfile = new File("C:\\Users\\ACT-C5-03\\eclipse-workspace\\thendral\\myfile.txt");
			Scanner myreader = new Scanner(myfile);
			while(myreader.hasNextLine()) {
				String data = myreader.nextLine();
				System.out.println(data);
				
			}
			myreader.close();
		}
			catch (FileNotFoundException e) {
				System.out.println("error u dumbass");
				e.printStackTrace();
			}
		}
	}


