// Simple Java Program for:
// DatabaseMetaData and ResultSetMetaData

import java.sql.*;

public class MetadataDemo {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect Database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            // ---------------------------
            // DatabaseMetaData
            // ---------------------------
            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Database Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbmd.getDriverName());

            // ---------------------------
            // ResultSetMetaData
            // ---------------------------
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("\nNumber of Columns: " + rsmd.getColumnCount());

            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println("Column Name: " + rsmd.getColumnName(i));
                System.out.println("Column Type: " + rsmd.getColumnTypeName(i));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}