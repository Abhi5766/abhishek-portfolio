// Simple Java Program for:
// CallableStatement (Stored Procedure)
// Scrollable and Updatable ResultSet

import java.sql.*;

public class CallableScrollableDemo {
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

            // ---------------------------------
            // CallableStatement (Stored Procedure)
            // ---------------------------------
            CallableStatement cs = con.prepareCall("{call addStudent(?, ?)}");

            cs.setInt(1, 102);
            cs.setString(2, "Rahul");

            cs.execute();
            System.out.println("Stored Procedure Executed");

            // ---------------------------------
            // Scrollable and Updatable ResultSet
            // ---------------------------------
            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            // Move to first record
            rs.first();
            System.out.println("First Record: " + rs.getInt("id") + " " + rs.getString("name"));

            // Move to last record
            rs.last();
            System.out.println("Last Record: " + rs.getInt("id") + " " + rs.getString("name"));

            // Update current row
            rs.updateString("name", "UpdatedName");
            rs.updateRow();

            System.out.println("Record Updated Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}