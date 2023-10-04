<%@ page contentType="text/html; charset=utf-8" language="java" %>

<html>
    <head>
    <title>FOR</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
    <h3> FOR EACH for days oh the week </h3>
        <c:forEach var="day" items="${days}" >
            <li>${day}</li>
        </c:forEach>

         <h3> Table with Counter </h3>
    <table>
        <thead>
            <tr>
                <th> day </th>
                <th> index </th>
                <th> count </th>
                <th> first </th>
                <th> last </th>
                <th> step </th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="day" items="${days}" step="1" varStatus="status" >
            <tr>
                <td> ${day} </td>
                <td> ${status.index} </td>
                <td> ${status.count} </td>
                <td> ${status.first} </td>
                <td> ${status.last} </td>
                <td> ${status.step} </td>
            </c:forEach>
            </tr>
        </tbody>
    </table>
       <h3> Table with Delims  </h3>
        <ul>
           <c:forTokens var="number" items= "${numbers}" delims="," >
               <li> ${number} </li>
           </c:forTokens>
        </ul>
    </body>
</html>