<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/6/10
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>MVC</title>
  </head>
  <body>
    <p>
      结合Serlvet和JSP进行数据的显示，就是一种MVC的思想。<br/>

      M 代表 模型（Model）<br/>
      V 代表 视图（View）<br/>
      C 代表 控制器（controller)<br/>

      模型是什么呢？ 模型就是数据，就是dao,bean<br/>

      视图是什么呢？ 就是网页, JSP，用来展示模型中的数据<br/>

      控制器是什么？ 控制器用来把不同的数据，显示在不同的视图上。 在这个例子的，Servlet就是充当控制器的角色，把Hero对象，显示在JSP上。<br/>

      控制器的作用就是把不同的数据(Model)，显示在不同的视图(View)上。
    </p>
  <form action="login" method="post">
    <table border="0">
      <tr>
        <td>用户名：</td>
        <td><input type="text" name="name" ></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="登录">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
