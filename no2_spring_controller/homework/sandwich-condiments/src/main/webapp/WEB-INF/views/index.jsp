<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/06/2023
  Time: 2:33 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="chosen-list" method="post">
    <c:forEach var="condiment" items="${condiments}">
        <input type="checkbox" name="condiment" value="${condiment.condiment}"> ${condiment.condiment}
    </c:forEach>
    <button>Save</button>
</form>
</body>
</html>
