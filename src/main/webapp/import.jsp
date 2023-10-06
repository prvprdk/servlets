 <%@ page contentType="text/html; charset=utf-8" language="java" %>

 <html>
     <head>
     <title>Import</title>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     </head>
     <body>
         <h2> Import</h2>

      <c:url value="title.jsp" var="importUrl" >
        <c:param name="pageName" value="page for import" />
      </c:url>

        <c:import url="${importUrl}" />



     </body>
 </html>