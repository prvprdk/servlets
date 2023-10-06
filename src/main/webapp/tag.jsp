<%@ page contentType="text/html; charset=utf-8" language="java" %>
 <%@ taglib uri="myTags" prefix="t" %>
 <html>
     <head>
     <title>TAG</title>

     </head>
     <body>

        <t:firsttag />
    <t:paramsTag  > <%= 100*100 %>   </t:paramsTag>

    <t:expressionBodyTag> a - letter. 44 - number. bg - two letter </t:expressionBodyTag>

     </body>
 </html>