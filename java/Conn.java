import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    // Constructor to establish the database connection
    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            c = DriverManager.getConnection("jdbc:mysql:///file", "root", "Preciselyyy@9");  // Use your MySQL password here
            s = c.createStatement();
        }
        catch (SQLException e) {
            System.out.println("Error connecting to the database. Please check your credentials and database settings.");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Please add the MySQL connector JAR file to the project.");
            e.printStackTrace();
        }
    }

    // Method to close the database connection and statement
    public void close() {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            System.out.println("Error closing database resources.");
            e.printStackTrace();
        }
    } }
