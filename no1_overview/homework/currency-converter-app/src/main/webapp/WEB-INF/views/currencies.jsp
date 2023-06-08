<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/06/2023
  Time: 7:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currencies</title>
</head>
<body>
    <h2>Currencies</h2>
    <ul>
    <c:forEach items="${currencies}" var="currency">
        <li>${currency.unit} - ${currency.exchangeRate}</li>
    </c:forEach>
    </ul>
    <form method="post" action="/convert">
        <table>
            <tr>
                <td>Amount: </td>
                <td><input type="text" name="amount"></td>
            </tr>
            <tr>
                <td>From Currency Unit: </td>
                <td>
                    <select name="fromCurrencyUnit">
                        <c:forEach items="${currencies}" var="currency">
                            <option value="${currency.unit}">${currency.unit}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>To Currency Unit: </td>
                <td>
                    <select name="toCurrencyUnit">
                        <c:forEach items="${currencies}" var="currency">
                            <option value="${currency.unit}">${currency.unit}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Convert">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
