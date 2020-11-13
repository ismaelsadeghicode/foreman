<%--
  Created by IntelliJ IDEA.
  User: ismael
  Date: 11/13/20
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>firstname</td>
        <td>lastname</td>
    </tr>
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
        </tr>
</table>

<a hidden="${pageContext.request.contextPath}/users"> user list</a>

</body>
</html>
