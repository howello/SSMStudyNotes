<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/9
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>课程列表</title>
    </head>
    <body>

        <h1 align="center">课程选择</h1>
        <form action="${pageContext.request.contextPath}/course/delete" method="post">
            <table>
                <tr>
                    <th>选择</th>
                    <th>课程</th>
                </tr>
                <tr>
                    <td><input name="ids" value="1" type="checkbox"></td>
                    <td>蒋政权牛逼一</td>
                </tr>
                <tr>
                    <td><input name="ids" value="2" type="checkbox"></td>
                    <td>蒋政权牛逼二</td>
                </tr>
                <tr>
                    <td><input name="ids" value="3" type="checkbox"></td>
                    <td>蒋政权牛逼三</td>
                </tr>
            </table>
            <input type="submit" value="删除">
        </form>
    </body>
</html>
