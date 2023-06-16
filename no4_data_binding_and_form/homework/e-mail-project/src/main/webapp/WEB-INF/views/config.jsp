<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16/06/2023
  Time: 5:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Configuration</title>
</head>
<body>
    <h1>Config</h1>
    <a href="configuration/setting">Update</a>
    <h3>${message}</h3>
    <table>
        <tr>
            <th>Languages: </th>
            <td>${initialConfig.languages}</td>
        </tr>
        <tr>
            <th>Page Size: </th>
            <td>${initialConfig.pageSize}</td>
        </tr>
        <tr>
            <th>Spam Filter: </th>
            <td>${initialConfig.spamFilter}</td>
        </tr>
        <tr>
            <th>Signature: </th>
            <td>${initialConfig.signature}</td>
        </tr>
    </table>
</body>
</html>
