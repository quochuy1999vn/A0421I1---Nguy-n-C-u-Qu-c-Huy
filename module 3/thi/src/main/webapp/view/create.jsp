<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 22-Nov-21
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<h1>Add new product</h1>
<form method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="text" name="quantity" id="quantity"></td>
        </tr>
        <tr>
            <td>Color</td>
            <td><input type="text" name="color" id="color"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" id="description"></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><select>
                <option>Computer</option>
                <option>Smart Phone</option>
            </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create Product"></td>
        </tr>
    </table>
</form>
</body>
</html>
