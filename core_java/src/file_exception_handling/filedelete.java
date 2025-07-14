package file_exception_handling;
import java.io.File;


public class filedelete {
	public static void main(String[] args) {
		
			File myfile = new File("C:\\Users\\ACT-C5-03\\eclipse-workspace\\thendral\\myfile.txt");
			if(myfile.delete()) {
				System.out.println("deleted :" + myfile.getName());
			}
			else
			{
				System.out.println("success ");
			}
		}
		
			
			
	}

