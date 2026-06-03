package 15 web based student reg; // if code not run remove this line

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String enroll = request.getParameter("enroll");
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO students VALUES(?,?,?)"
            );

            ps.setString(1, enroll);
            ps.setString(2, name);
            ps.setString(3, pass);

            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("Registration Successful");
                out.println("<br><a href='login.jsp'>Login Now</a>");
            }

            con.close();

        } catch (Exception e) {
            out.println(e);
        }
    }
}