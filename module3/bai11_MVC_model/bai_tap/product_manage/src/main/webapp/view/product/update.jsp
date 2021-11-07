<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 03-Nov-21
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Product</title>
</head>
<body>
<h1>Update Product</h1>
<form method="post">
    <fieldset>
        <legend>Update</legend>
        <table>
            <tr>
                <td>ID: </td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>Product Name: </td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
