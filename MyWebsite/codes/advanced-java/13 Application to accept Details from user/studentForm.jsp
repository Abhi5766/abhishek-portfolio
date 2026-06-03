<%@ page import="java.sql.*" %>

<html>
<body>

<h2>Student Registration Form</h2>

<form method="post">
    Enter ID:
    <input type="text" name="id"><br><br>

    Enter Name:
    <input type="text" name="name"><br><br>

    <input type="submit" value="Save">
</form>

<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");

    if (id != null && name != null) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect Database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            // Insert Data
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student(id, name) VALUES(?, ?)"
            );

            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);

            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("<h3>Record Inserted Successfully</h3>");
            }

            con.close();

        } catch (Exception e) {
            out.println(e);
        }
    }
%>

</body>
</html>

//database table
CREATE TABLE student (
    id INT,
    name VARCHAR(50)
);