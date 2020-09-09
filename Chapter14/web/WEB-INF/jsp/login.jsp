<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/9
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>用户登录</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/login" method="post">
            用户名：<input type="text" name="username" id="username"/><br/>
            密&nbsp;&nbsp;码：<input type="password" id="password" name="password"/><br/>
            <input type="submit" value="登录">
        </form>
        ${msg}
    </body>
</html>
