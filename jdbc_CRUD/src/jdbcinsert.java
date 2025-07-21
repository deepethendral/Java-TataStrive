import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcinsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database_name"; //  Make sure this is correct
        String username = "your_username";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            String insertQuery = "INSERT INTO employees (id, name, dept, address, salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(insertQuery);

            // Insert Row 1
            pst.setInt(1, 205);
            pst.setString(2, "santhosh");
            pst.setString(3, "marketing");
            pst.setString(4, "456 MG Road");
            pst.setInt(5, 300000);
            pst.executeUpdate();

            // Insert Row 2
            pst.setInt(1, 206);
            pst.setString(2, "arunagiri");
            pst.setString(3, "sales");
            pst.setString(4, "789 Park Street");
            pst.setInt(5, 280000);
            pst.executeUpdate();

            System.out.println("New rows inserted successfully.");

            pst.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}
