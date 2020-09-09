<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/9
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>用户信息</title>
    </head>
    <body>
        <table align="ceter" width="80%">
            <tr>
                <th width="30%">用户ID</th>
                <th width="30%">用户姓名</th>
                <th width="30%">用户密码</th>
            </tr>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </table>
    </body>
</html>
