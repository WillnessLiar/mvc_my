<%--
  Created by IntelliJ IDEA.
  User: Will
  Date: 2019/7/1
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
    用户账号：<input type="text" name="username"/><br/>
    用户密码：<input type="password" name="password"/><br/>
    <input type="submit" value="登陆"/>

</form>


</body>
</html>
