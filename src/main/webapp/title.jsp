 <%@ page contentType="text/html; charset=utf-8" language="java" %>

 <html>
     <head>
     <title>title</title>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     </head>
     <body>
         <h2> Import</h2>

      <%
         String pageName = request.getParameter("pageName");
         request.setAttribute("pageNameVar", pageName);
      %>
      <h3> this is import ${pageNameVar} </h3>

     </body>
 </html>