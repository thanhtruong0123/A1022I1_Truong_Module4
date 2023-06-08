<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/06/2023
  Time: 11:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <form method="post" action="/translate">
        <h1>Dictionary</h1>
        <table>
            <tr>
                <td>Dictionary type:</td>
                <td>
                    <select name="type">
                        <option value="eng">Eng - Vie</option>
                        <option value="vie">Vie - Eng</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Input word: </td>
                <td><input type="text" name="inputWord"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Translate"></td>
            </tr>
        </table>
    </form>
</body>
</html>
