<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/06/2023
  Time: 10:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coversion Result</title>
</head>
<body>
  <h3><a href="${pageContext.request.contextPath}/currencies">Back</a></h3>
  <table>
    <caption>Conversion Result</caption>
    <tr>
      <td>Amount: </td>
      <td>${amount}</td>
    </tr>
    <tr>
      <td>From Currency Unit: </td>
      <td>${fromCurrencyUnit}</td>
    </tr>
    <tr>
      <td>To Currency Unit: </td>
      <td>${toCurrencyUnit}</td>
    </tr>
    <tr>
      <td>Converted Amount: </td>
      <td>${convertedAmount}</td>
    </tr>
  </table>
</body>
</html>
