
import java.io.*;

// Class that contains the list and writes it to a file
class ListOfNumber {
    private int[] list = {2, 3, 4, 5, 6};

    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement...");
            out = new PrintWriter(new FileWriter("myfile.txt"));

            // Loop through array elements
            for (int i = 0; i < list.length; i++) {
                System.out.println("Value at: " + i + " = " + list[i]);
                out.println("Value at: " + i + " = " + list[i]);
            }

        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}

// Main class that contains the main method
class Exception1 {
    public static void main(String[] args) {
        ListOfNumber list = new ListOfNumber();
        list.writeList();
    }
}
