

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcupdate{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);

            // --- Insert multiple rows ---
            String insertQuery = "INSERT INTO employees (id, name, dept, address, salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstInsert = c.prepareStatement(insertQuery);

            // First row
            pstInsert.setInt(1, 201);
            pstInsert.setString(2, "thendral");
            pstInsert.setString(3, "it");
            pstInsert.setString(4, "789 Beach Rd");
            pstInsert.setInt(5, 200000);
            pstInsert.executeUpdate();

            // Second row
            pstInsert.setInt(1, 202);
            pstInsert.setString(2, "kalpana");
            pstInsert.setString(3, "non it");
            pstInsert.setString(4, "123 Anna Nagar");
            pstInsert.setInt(5, 250000);
            pstInsert.executeUpdate();
            
            // third row
            pstInsert.setInt(1, 203);
            pstInsert.setString(2, "velvizhi");
            pstInsert.setString(3, "mbbs");
            pstInsert.setString(4, "567 bharathi Nagar");
            pstInsert.setInt(5, 500000);
            pstInsert.executeUpdate();
            
         // forth  row
            pstInsert.setInt(1, 204);
            pstInsert.setString(2, "saranya");
            pstInsert.setString(3, "finances");
            pstInsert.setString(4, "345 t nagar");
            pstInsert.setInt(5, 18000);
            pstInsert.executeUpdate();


            // Close insert statement
            pstInsert.close();

            // --- Now update one row ---
            String updateQuery = "UPDATE employees SET  address= ?, salary= ? WHERE id = ?";
            PreparedStatement pstUpdate = c.prepareStatement(updateQuery);

            pstUpdate.setInt(1, 26); // new age
            pstUpdate.setString(2, "Physics"); // new subject
            pstUpdate.setInt(3, 111); // update student with id = 111

            int rowsUpdated = pstUpdate.executeUpdate();
            System.out.println("Number of rows updated: " + rowsUpdated);

            // Close update statement and connection
            pstUpdate.close();
            c.close();

            System.out.println("Done: rows inserted and updated without deleting.");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}

