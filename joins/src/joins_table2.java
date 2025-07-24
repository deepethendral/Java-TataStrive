import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class joins_table2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbemp"; 
        String username = "root";
        String password = "thendral@007";

        String insertQuery = "INSERT INTO products_table (product_id, product_name, product_sellingprice, product_mrp, product_brand) VALUES (?, ?, ?, ?, ?)";

        try (Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = con1.prepareStatement(insertQuery);

            System.out.print("How many employee records do you want to insert? ");
            int n = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline

            int totalInserted = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for products " + (i + 1) + ":");

                System.out.print("product id (int): ");
                int product_id = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("product name (String): ");
                String product_name = scanner.nextLine();

                System.out.print("product selling price (String): ");
                int product_sellingprice = scanner.nextInt();

                System.out.print("product mrp (int): ");
                int product_mrp = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("product brand (string): ");
                String product_brand = scanner.nextLine();

                pst.setInt(1, product_id);
                pst.setString(2, product_name);
                pst.setInt(3, product_sellingprice);
                pst.setInt(4, product_mrp);
                pst.setString(5, product_brand);

                totalInserted += pst.executeUpdate();
                System.out.println("Inserted record for employee " + product_name + "\n");
            }

            System.out.println("Number of rows inserted: " + totalInserted);

            pst.close();
            con1.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL error occurred: " + e.getMessage());
        }
    }
}

