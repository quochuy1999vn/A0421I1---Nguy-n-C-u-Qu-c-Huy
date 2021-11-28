<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 27-Nov-21
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form method="post" action="/result">
  <label>Rate: </label>
  <input type="text" name="rate" placeholder="Rate" value="23000"><br>
  <label>USD: </label>
  <input type="text" name="usd" placeholder="USD" value="0"><br>
  <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>
