<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
    <c:set var="salary" value="323422"/>
    <p>Before remove salary = </p>
    <c:out value="${salary}"/>
    <c:remove var="salary"/>
    <p>After remove salary = </p>
    <c:out value="${salary}"/>
    <br>
    <c:set var="salaryNew" value="1000"/>
    <c:if test="${salaryNew > 500}">
        <p>My salary equals = <c:out value="${salaryNew}"/></p>
    </c:if>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>