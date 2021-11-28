<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 01-Nov-21
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<form action="/products?action=create" method="post">
    <fieldset>
        <legend>List Product</legend>
        <table border="1">
            <tr>
                <td>Id</td>
                <td>Name Product</td>
                <td>Price</td>
                <td>Description</td>
                <td>Producer</td>
                <td></td>
                <td></td>
            </tr>
            <c:forEach items="${requestScope['products']}" var="product">
                <tr>
                    <td>${product.getId()}</td>
                    <td>${product.getProductName()}</td>
                    <td>${product.getPrice()}</td>
                    <td>${product.getDescription()}</td>
                    <td>${product.getProducer()}</td>
                    <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
                    <td><a href="/products?action=viewDetail&id=${product.getId()}">detail</a></td>
                    <td><a href="/products?action=update&id=${product.getId()}">update</a></td>
                </tr>
            </c:forEach>
        </table>
    </fieldset>
</form>
</body>
</html>
