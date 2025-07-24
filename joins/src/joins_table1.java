import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class joins_table1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbemp"; 
        String username = "root";
        String password = "thendral@007";

        String insertQuery = "INSERT INTO employees_table (emp_id, emp_name, emp_address, emp_salary, emp_role) VALUES (?, ?, ?, ?, ?)";

        try (Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = con1.prepareStatement(insertQuery);

            System.out.print("How many employee records do you want to insert? ");
            int n = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline

            int totalInserted = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for employee " + (i + 1) + ":");

                System.out.print("Employee ID (int): ");
                int emp_id = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Employee Name (String): ");
                String emp_name = scanner.nextLine();

                System.out.print("Employee Address (String): ");
                String emp_address = scanner.nextLine();

                System.out.print("Employee Salary (int): ");
                int emp_salary = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Employee Role (string): ");
                String emp_role = scanner.nextLine();

                pst.setInt(1, emp_id);
                pst.setString(2, emp_name);
                pst.setString(3, emp_address);
                pst.setInt(4, emp_salary);
                pst.setString(5, emp_role);

                totalInserted += pst.executeUpdate();
                System.out.println("Inserted record for employee " + emp_name + "\n");
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
