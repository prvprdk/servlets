<%@ page import = "java.util.List" %>
<%@ page import = "org.example.Car" %>
<!DOCTYPE html>

<head>

    <title>MainPage</title>
</head>
<body>
<h1>Hy, its jsp page</h1>
<h2>How do yoy do</h2>
<hr/>
<%= request.getRequestURI() %>
<%
List <Car> cars = (List) request.getAttribute("cars");
%>
<table>
    <% for (Car car : cars) { %>
            <tr>
                <td>
                <% if (car.getBrand().equals("audi")) { %>
                 <b> <%= car.getBrand() %> <b>
                 <% } else { %>
                    <%= car.getBrand() %>
                 <% } %>
                </td>
                <td> <%= car.getColor() %> </td>
                <td> <%=  car.getYear() %> </td>


            </tr>
    <% } %>
</table>
</body>
</html>