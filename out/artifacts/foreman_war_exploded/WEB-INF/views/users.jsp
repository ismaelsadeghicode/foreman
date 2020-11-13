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
        <c:url var="deleteLink"  value="${pageContext.request.contextPath}/delete">
            <c:param name="id" value="${user.id}"/>
        </c:url>
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>
                <a href="${deleteLink}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="${pageContext.request.contextPath}/addUser">
    add users </a>
</body>
</html>
