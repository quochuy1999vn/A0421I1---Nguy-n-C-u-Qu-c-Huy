<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 29-Oct-21
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/Calculator" method="post">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>First operand: </td>
          <td><input name="first-operand" type="text"></td>
        </tr>
        <tr>
          <td>operator: </td>
          <td>
            <select name="operator">
              <option value="+">Addtion</option>
              <option value="-">Substraction</option>
              <option value="*">Multiplication</option>
              <option value="/">Division</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Second operand: </td>
          <td><input name="second-operand" type="text"></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="calculate"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
