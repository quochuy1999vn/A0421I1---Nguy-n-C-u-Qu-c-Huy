<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 03-Dec-21
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>sandwich condiments is: <c:forEach items="${condiment}" var="sandwich">${sandwich} </c:forEach> </h1>
</body>
</html>
