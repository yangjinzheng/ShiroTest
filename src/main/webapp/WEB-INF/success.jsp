<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2018/1/21
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>成功</title>
</head>
<body>
登陆成功
<shiro:hasRole name="admin">欢迎有admin角色的用户！<shiro:principal/>
</shiro:hasRole>
<shiro:hasPermission name="student:create">
    欢迎有student:create权限的用户！<shiro:principal/>
</shiro:hasPermission>
</body>
</html>
