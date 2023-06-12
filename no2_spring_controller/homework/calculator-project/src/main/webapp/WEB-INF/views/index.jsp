<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/06/2023
  Time: 3:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
    <h1>Caculator</h1>
    <form action="/caculate" method="post">
        <input type="text" name="operand1" placeholder="First Operand">
        <input type="text" name="operand2" placeholder="Second Operand"><br/>
        <br/>
        <button name="operator" value="addition">Addiction(+)</button>
        <button name="operator" value="subtraction">Subtraction(-)</button>
        <button name="operator" value="multiplication">Multiplication(x)</button>
        <button name="operator" value="division">Division(/)</button>
        <hr/>
        ${message}
    </form>
</body>
</html>
