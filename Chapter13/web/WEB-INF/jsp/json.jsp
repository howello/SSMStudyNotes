<%--
  Created by IntelliJ IDEA.
  User: UASD_LuHao
  Date: 2020/9/9
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
        <title>JSON交互</title>
        <script src="https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js"></script>
        <script type="text/javascript">
            function testJson() {
                alert("开始");
                var loginname = $("#loginname").val();
                alert(loginname);
                var password = $("#password").val();
                alert(password);
                $.ajax({
                    url: "${pageContext.request.contextPath}/test",
                    type: "post",
                    data: JSON.stringify({loginname: loginname, password: password}),
                    contentType: "application/json;charset=utf-8",
                    dataTypes: "json",
                    success: function (data) {
                        if (data != null) {
                            alert("你输入的信息为：\n登录名：" + data.loginname + "\n密码：" + data.password);
                        }
                    }
                });
            }
        </script>

    </head>
    <body>
        <form>
            登录名:<input type="text" name="loginname" id="loginname">
            密&nbsp;&nbsp;码：<input type="password" name="password" id="password">
            <input type="submit" value="提交" onclick="testJson()">
        </form>

    </body>
</html>
