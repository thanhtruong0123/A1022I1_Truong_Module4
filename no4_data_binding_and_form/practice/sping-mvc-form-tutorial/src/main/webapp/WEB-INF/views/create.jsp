<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/06/2023
  Time: 7:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
    <h3>Welcome, Enter The Employee Details</h3>
    <form:form modelAttribute="employee" method="post" action="addEmployee">
        <table>
            <tr>
                <td><form:label path="id">Employee ID:</form:label></td>
                <td><form:input path="id"/></td>
            </tr>
            <tr>
                <td><form:label path="name">Employee's name: </form:label></td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="contactNumber">Contact's number:</form:label></td>
                <td><form:input path="contactNumber"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
