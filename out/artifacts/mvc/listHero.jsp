<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/6/10
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<script src="js&css/jquery.min.js"></script>
<link href="js&css/bootstrap.min.css" rel="stylesheet">
<script src="js&css/bootstrap.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>listHero</title>
    <script>
        $(function () {
            $("a").addClass("btn btn-default btn-xs");

        });

    </script>
</head>
<body>
<table style="width:500px; margin:44px auto" class="table table-striped table-bordered table-hover  table-condensed"
       align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>hp</td>
        <td>damage</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <c:forEach items="${heros}" var="hero" varStatus="st">
        <tr>
            <td>${hero.id}</td>
            <td>${hero.name}</td>
            <td>${hero.hp}</td>
            <td>${hero.damage}</td>
            <td><a href="editHero?id=${hero.id}">edit</a></td>
            <td><a href="deleteHero?id=${hero.id}">delete</a></td>
        </tr>
    </c:forEach>
<%--    <tr>--%>
<%--        <td colspan="6" align="center">--%>
<%--            <a href="?start=0">[首 页]</a>--%>
<%--            <a href="?start=${pre}">[上一页]</a>--%>
<%--            <a href="?start=${next}">[下一页]</a>--%>
<%--            <a href="?start=${last}">[末 页]</a>--%>
<%--        </td>--%>
<%--    </tr>--%>
</table>
<nav>
    <ul class="pager">

        <li><a href="?start=0">首  页</a></li>
        <li><a href="?start=${pre}">上一页</a></li>
        <li><a href="?start=${next}">下一页</a></li>
        <li><a href="?start=${last}">末  页</a></li>
    </ul>
</nav>
</body>
</html>
