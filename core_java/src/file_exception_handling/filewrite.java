package file_exception_handling;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
	public static void main(String[] args) {
		try
		{
		FileWriter myfile = new FileWriter("C:\\Users\\ACT-C5-03\\eclipse-workspace\\thendral\\myfile.txt");
		myfile.write("thendral and mosi are good girls");
		System.out.println("file are successfully wroted");
		myfile.close();
		
		}
		catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
		
	}

}
