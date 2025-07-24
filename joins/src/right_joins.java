import java.sql.*;

public class right_joins {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbemp";
        String username = "root";
        String password = "thendral@007";

        String query = "SELECT e.emp_id, e.emp_name, p.product_id, p.product_name, p.product_brand " +
                       "FROM employees_table e " +
                       "RIGHT JOIN products_table p ON e.emp_id = p.product_id";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            System.out.printf("%-8s %-15s %-12s %-20s %-15s%n", 
                              "Emp ID", "Emp Name", "Prod ID", "Product Name", "Brand");
            System.out.println("--------------------------------------------------------------------------");

            while (rs.next()) {
                int empId = rs.getInt("emp_id");
                String empName = rs.getString("emp_name");
                int prodId = rs.getInt("product_id");
                String prodName = rs.getString("product_name");
                String brand = rs.getString("product_brand");

                System.out.printf("%-8s %-15s %-12d %-20s %-15s%n",
                                  (rs.wasNull() ? "NULL" : empId),
                                  (empName == null ? "NULL" : empName),
                                  prodId, prodName, brand);
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
