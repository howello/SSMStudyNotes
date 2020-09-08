<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/8
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>查询班级</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/student/search" method="post">
            学生编号：<input type="text" name="stu_id"/><br>
            学生姓名：<input type="text" name="stu_name"/><br>
            所属班级：<input type="text" name="banji.banji_name"/><br>
            <input type="submit" value="查询">
        </form>
    </body>
</html>
