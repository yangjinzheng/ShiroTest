<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2018/1/21
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<table align="center" border="1">
<form action="/login" method="get">
    <tr>
        <td>用户名</td>
        <td><input type="text" name="Username"/></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="text" name="password"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"/></td>
    </tr>
</form>
</table>
</body>
</html>
