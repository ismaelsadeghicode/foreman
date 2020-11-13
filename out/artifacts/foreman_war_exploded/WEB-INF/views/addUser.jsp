<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/saveUser" method="post" modelAttribute="user">
    <form:hidden path="id"/>
    <table>
        <tbody>
        <tr>
            <td><label>First Name</label></td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td><label>last Name</label></td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td><label> </label></td>
            <td><input type="submit" value="save" class="save"></td>
        </tr>

        </tbody>
    </table>
</form:form>

    <a href="${pageContext.request.contextPath}/users">
        back to the form </a>
</body>
</html>
