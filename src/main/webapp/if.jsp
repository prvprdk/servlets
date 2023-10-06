 <%@ page contentType="text/html; charset=utf-8" language="java" %>

 <html>
     <head>
     <title>IF</title>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     </head>
     <body>
         <h3> IF</h3>

      <%
         String hourParam = request.getParameter("hour");
         request.setAttribute("hourVar", hourParam);
      %>

      <c:if test="${hourVar >= 10 &&  hourVar < 19}" >
         ${hourVar} it is day
      </c:if>

     </body>
 </html>