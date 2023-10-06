 <%@ page contentType="text/html; charset=utf-8" language="java" %>

 <html>
     <head>
     <title>CASE</title>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     </head>
     <body>
         <h3> Case</h3>

      <%
         String varSal = request.getParameter("salary");
         request.setAttribute("salary", varSal);
      %>

    <c:choose >
    <c:when test = "${salary <= 1000}">
            Salary is very low to survive.
         </c:when>

         <c:when test = "${salary >= 1000}">
            Salary is very good.
         </c:when>

         <c:otherwise>
            No comment sir... Please add your salary
         </c:otherwise>

    </c:choose>

     </body>
 </html>