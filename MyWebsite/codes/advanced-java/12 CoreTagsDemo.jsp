<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%!
    // Declaration Tag
    String name = "Abhi";

    int square(int n) {
        return n * n;
    }
%>

<html>
<body>

<h2>JSP Core Tags Demo</h2>

<%
    // Scriptlet Tag
    int num = 5;
%>

<!-- Expression Tag -->
Name: <%= name %><br>

Number: <%= num %><br>

Square of Number: <%= square(num) %><br>

</body>
</html>