<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 22-Nov-21
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<button><a href="/products?action=create">Add new product</a></button>
<input type="hidden" name="action" value="search">
<input name="name">
<button type="submit">Search</button>
<fieldset>
    <legend>Product List</legend>
    <table>
        <tr>
            <th>#</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.price}"/></td>
            <td><c:out value="${product.quantity}"/></td>
            <td><c:out value="${product.color}"/></td>
            <td><c:out value="${product.category}"/></td>
            <td>
                <a href="/products?action=edit&id=${product.id}">Edit</a>
                <a href="/products?action=delete&id=${product.id}">Delete</a>
            </td>
        </c:forEach>
    </table>
</fieldset>
</body>
</html>
