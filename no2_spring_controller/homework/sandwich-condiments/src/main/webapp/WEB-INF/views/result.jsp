<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/06/2023
  Time: 2:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
  <h1>Sandwich Chosen Condiments</h1>
  <c:forEach items="${condimentList}" var="condiment">
    ${condiment.toString()} <br/>
  </c:forEach>
</body>
</html>
