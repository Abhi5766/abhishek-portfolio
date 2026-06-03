<%@ page import="java.sql.*" %>

<html>
<body>
<h2>Student Login</h2>

<form method="post">
    Enrollment No: <input type="text" name="enroll"><br><br>
    Password: <input type="password" name="pass"><br><br>
    <input type="submit" value="Login">
</form>

<%
String enroll = request.getParameter("enroll");
String pass = request.getParameter("pass");

if(enroll != null && pass != null)
{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "password"
        );

        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM students WHERE enroll=? AND password=?"
        );

        ps.setString(1, enroll);
        ps.setString(2, pass);

        ResultSet rs = ps.executeQuery();

        if(rs.next())
        {
            response.sendRedirect("index.jsp");
        }
        else
        {
            out.println("<h3>Login Failed</h3>");
        }

        con.close();

    } catch(Exception e){
        out.println(e);
    }
}
%>

</body>
</html>