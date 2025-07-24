import java.sql.*;

public class left_joins {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbemp";
        String username = "root";
        String password = "thendral@007";

        String leftJoinQuery = 
            "SELECT e.emp_id, e.emp_name, p.product_id, p.product_name, p.product_brand " +
            "FROM employees_table e " +
            "LEFT JOIN products_table p ON e.emp_id = p.product_id";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = con.prepareStatement(leftJoinQuery);
            ResultSet rs = pst.executeQuery();

            System.out.printf("%-8s %-15s %-10s %-20s %-15s%n", 
                              " Emp ID "  , " Emp Name "  , " Prod ID "  , " Product Name "  , " Brand "  );
            System.out.println("-----------------------------------------------------------------");

            while (rs.next()) {
                int empId = rs.getInt("emp_id");
                String empName = rs.getString("emp_name");
                int prodId = rs.getInt("product_id");
                String prodName = rs.getString("product_name");
                String brand = rs.getString("product_brand");

                System.out.printf("%-8d %-15s %-10s %-20s %-15s%n",
                                  empId,
                                  empName != null ? empName : "NULL",
                                  (rs.wasNull() ? "NULL" : String.valueOf(prodId)),
                                  prodName != null ? prodName : "NULL",
                                  brand != null ? brand : "NULL");
            }

            rs.close();
            pst.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
