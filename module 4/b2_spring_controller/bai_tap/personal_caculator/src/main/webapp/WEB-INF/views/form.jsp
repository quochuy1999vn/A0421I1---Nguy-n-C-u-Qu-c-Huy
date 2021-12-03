<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 03-Dec-21
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Choose Condiments</title>
  </head>
  <body>
    <h1>Calculator</h1>
    <form action="/result" method="post">
      <input type="text" value="${number1}" name="number1">
      <input type="text" value="${number2}" name="number2">
      <input type="submit" value="addition(+)" name="calculator">
      <input type="submit" value="subtraction(-)" name="calculator">
      <input type="submit" value="multiplication(x)" name="calculator">
      <input type="submit" value="division(/)" name="calculator">
    </form>
  </body>
</html>
