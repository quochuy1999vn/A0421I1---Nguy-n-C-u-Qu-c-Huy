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
  <fieldset>
    <legend>Sandwich Condiments</legend>
    <form action="result" method="post">
      <input type="checkbox" name="condiment" value="Lettuce">Lettuce
      <input type="checkbox" name="condiment" value="Tomato">Tomato
      <input type="checkbox" name="condiment" value="Mustard">Mustard
      <input type="checkbox" name="condiment" value="Sprouts">Sprouts
      <br>
      <input type="submit" value="save">
    </form>
  </fieldset>
  </body>
</html>
