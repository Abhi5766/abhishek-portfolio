// Simple Servlet Program

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Create output stream
        PrintWriter out = response.getWriter();

        // Display message
        out.println("<html><body>");
        out.println("<h2>Hello, This is Simple Servlet Program</h2>");
        out.println("</body></html>");

        out.close();
    }
}