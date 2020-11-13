<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <c:forEach items="${users}" var="user">
        <tr>
        <td>${user.id}</td>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
    </tr>
    </c:forEach>
</table>

<a href="${pageContext.request.contextPath}/addUser">
    add users </a>
</body>
</html>
