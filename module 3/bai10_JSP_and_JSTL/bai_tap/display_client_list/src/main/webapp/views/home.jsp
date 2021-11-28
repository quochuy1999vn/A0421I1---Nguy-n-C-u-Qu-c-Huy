<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 30-Oct-21
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Danh sách khách hàng</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table>
    <thead>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
    </tr>
    </thead>
    <c:forEach items="${listCustomer}" var="customer" varStatus="status">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" width="180px" height="180px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
