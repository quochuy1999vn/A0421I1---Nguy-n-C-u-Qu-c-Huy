<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 01-Nov-21
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<form action="/ProductServlet?action=delete" method="post">
    <fieldset>
        <legend>Delete Product</legend>
        <table>
            <tr>
                <td>id: </td>
                <td>${requestScope["product"].getId()}</td>
            </tr>
            <tr>
                <td>Product Name: </td>
                <td>${requestScope["product"].getProductName()}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td>${requestScope["product"].getProducer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Product"></td>
                <td><a href="/ProductServlet">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
