<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14/06/2023
  Time: 7:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings</title>
</head>
<body>
    <h1>Settings</h1>
    <form:form modelAttribute="updateConfig" method="post">
        <table>
            <tr>
                <th><form:label path="languages">Languages:</form:label></th>
                <td>
                    <form:select path="languages">
                        <form:option value="english">English</form:option>
                        <form:option value="vietnamese">Vietnamese</form:option>
                        <form:option value="japanese">Japanese</form:option>
                        <form:option value="chinese">Chinese</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <th><form:label path="pageSize">Page Size:</form:label></th>
                <td>
                    <span>Show </span>
                    <form:select path="pageSize">
                        <form:option value="5">5</form:option>
                        <form:option value="10">10</form:option>
                        <form:option value="15">15</form:option>
                        <form:option value="25">25</form:option>
                        <form:option value="50">50</form:option>
                        <form:option value="100">100</form:option>
                    </form:select>
                    <span> emails per page</span>
                </td>
            </tr>
            <tr>
                <th><form:label path="spamFilter">Page Size:</form:label></th>
                <td>
                    <form:checkbox path="spamFilter" value="true" /> Enable spams filter
                </td>
            </tr>
            <tr>
                <th><form:label path="signature">Signature:</form:label></th>
                <td>
                    <form:textarea path="signature" rows="4" cols="50" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <form:button>Update</form:button>
                    <form:button type="button">Cancel</form:button>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
