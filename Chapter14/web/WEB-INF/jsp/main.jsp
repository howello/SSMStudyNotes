<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/9
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>管理主页</title>
    </head>
    <body>
        <h1>当前用户信息：${sessionScope.user_session.username}</h1>
        <a href="${pageContext.request.contextPath}/logout">退出登录</a>
    </body>
</html>
