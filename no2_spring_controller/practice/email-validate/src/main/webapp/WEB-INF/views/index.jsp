<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 09/06/2023
  Time: 8:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validate</title>
</head>
<body>
  <h1>Email Validate</h1>
  <h3 style="color:red">${message}</h3>

  <form method="post" action="validate">
    <input type="text" name="email"><br/>
    <input type="submit" value="Validate">
  </form>
</body>
</html>
