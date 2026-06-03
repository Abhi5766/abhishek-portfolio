// Servlet Program to read request parameter
// and generate multiplication table

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TableServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Read number from HTML form
        int num = Integer.parseInt(request.getParameter("number"));

        out.println("<html><body>");
        out.println("<h2>Multiplication Table of " + num + "</h2>");

        for (int i = 1; i <= 10; i++) {
            out.println(num + " x " + i + " = " + (num * i) + "<br>");
        }

        out.println("</body></html>");

        out.close();
    }
}