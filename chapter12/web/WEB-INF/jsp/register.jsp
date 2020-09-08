<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/8
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>注册</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/user/register" method="post">
            用户名：<input type="text" name="username"/>
            <hr>
            密&nbsp;&nbsp;码：<input type="password" name="password">
            <hr>
            <input type="submit" value="注册">
        </form>
    </body>
</html>
