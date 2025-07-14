package file_exception_handling;
import java.io.File;
import java.io.IOException;
public class filecreate {
	public static void main(String[] args) {
		try {
			File myfile = new File("newfile.txt");
			if(myfile.createNewFile()) {
				System.out.println("created file :" + myfile.getName());
			}
			else {
				System.out.println("created file already exists");
			}
		}
		catch(IOException e) {
			System.out.println("error :");
			e.printStackTrace();
		}
	}

}
