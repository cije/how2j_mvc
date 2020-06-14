<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/6/13
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
    <%
        application.setAttribute("test",1);
        application.setAttribute("test",2);
        application.removeAttribute("test");
    %>
</body>
</html>
