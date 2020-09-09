<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/9
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>编辑</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/student/edit" method="post">
            <table >
                <tr>
                    <th>id</th>
                    <th>name</th>
                </tr>

                <tr>
                    <td><input type="checkbox" value="1" name="studentList[0].stu_id"></td>
                    <td><input type="text" name="studentList[0].stu_name"></td>
                </tr>

                <tr>
                    <td><input type="checkbox" value="2" name="studentList[1].stu_id"></td>
                    <td><input type="text" name="studentList[1].stu_name"></td>
                </tr>

                <tr>
                    <td><input type="checkbox" value="3" name="studentList[2].stu_id"></td>
                    <td><input type="text" name="studentList[2].stu_name"></td>
                </tr>
            </table>
            <input type="submit" value="提交">
        </form>
    </body>
</html>
