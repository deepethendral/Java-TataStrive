import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcdelete{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database_name";  // ✅ Ensure this is correct
        String username = "your_username";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // --- DELETE operation ---
            String deleteQuery = "DELETE FROM employees WHERE id = ?";
            PreparedStatement pstDelete = conn.prepareStatement(deleteQuery);

            pstDelete.setInt(1, 204);  // 🛑 Change this to the actual ID you want to delete

            int rowsDeleted = pstDelete.executeUpdate();
            System.out.println("Number of rows deleted: " + rowsDeleted);

            pstDelete.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}
