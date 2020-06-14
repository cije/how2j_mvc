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

        session.setAttribute("test1", 1);
        session.setAttribute("test1", 2);
        session.removeAttribute("test1");

        request.setAttribute("test2",1);
        request.setAttribute("test2",2);
        request.removeAttribute("test2");
    %>
</body>
</html>
