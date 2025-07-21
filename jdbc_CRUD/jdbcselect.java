import java.sql.*;

public class jdbcselect {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/databasename";
        String user = "your_username";
        String password = "your_password";

        // Load MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to database
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            System.out.println("Connection Successful!");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
