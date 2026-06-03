<%@ page import="java.sql.*" %>

<html>
<body>
<h2>User Registration</h2>

<form method="post">
    Username: <input type="text" name="uname"><br><br>
    Password: <input type="password" name="pass"><br><br>
    <input type="submit" value="Register">
</form>

<%
String uname = request.getParameter("uname");
String pass = request.getParameter("pass");

if(uname != null && pass != null)
{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "password"
        );

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO users(username,password) VALUES(?,?)"
        );

        ps.setString(1, uname);
        ps.setString(2, pass);

        int i = ps.executeUpdate();

        if(i > 0)
            out.println("Registration Successful");

        con.close();

    } catch(Exception e){
        out.println(e);
    }
}
%>

</body>
</html>