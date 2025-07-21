// Java program to implement a simple JDBC application
/*
 *1. import --->java.sql
 *2. load and register the driver ---> com.jdbc.
 *3. create connection
 *4. create a statement
 *5. execute the query
 *6. process the results
 *7. close
 */

import java.sql.*;

public class jdbccreate {
    public static void main(String[] args)
    {
        // Database URL, user name, and password

        // Replace with your database name
        String url
            = "jdbc:mysql://localhost:3306/your database_name";

        // Replace with your MySQL user name
        String username = "your_username";

        // Replace with your MySQL password
        String password = "your_password";

        // Updated query syntax for modern databases
        String query
            = "INSERT INTO employees (id, name , dept) VALUES (101, 'thendral' , 200000)";

        // Establish JDBC Connection
        try {
          
            // Load Type-4 Driver
            // MySQL Type-4 driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection c = DriverManager.getConnection(
                url, username, password);

            // Create a statement
            Statement st = c.createStatement();

            // Execute the query
            int count = st.executeUpdate(query);
            System.out.println(
                "Number of rows affected by this query: "
                + count);

            // Close the connection
            st.close();
            c.close();
            System.out.println("Connection closed.");
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                               + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("SQL Error: "
                               + e.getMessage());
        }
    }
}
