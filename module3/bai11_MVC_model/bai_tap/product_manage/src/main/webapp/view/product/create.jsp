<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 01-Nov-21
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<form>
<fieldset>
    <legend>Create Product</legend>
    <table>
        <tr>
            <td>id: </td>
            <td><input type="text" name="id" id="id"></td>
        </tr>
        <tr>
            <td>Product Name: </td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
        <tr>
            <td>Description: </td>
            <td><input type="text" name="description" id="description"></td>
        </tr>
        <tr>
            <td>Producer: </td>
            <td><input type="text" name="producer" id="producer"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create Product"></td>
        </tr>
    </table>
</fieldset>
</form>
</body>
</html>
