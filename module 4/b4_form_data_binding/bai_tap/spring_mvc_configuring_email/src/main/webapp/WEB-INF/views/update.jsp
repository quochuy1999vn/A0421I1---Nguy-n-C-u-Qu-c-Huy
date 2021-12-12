<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 08-Dec-21
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Update</title>
  </head>
  <body>
    <h1>Settings</h1>
    <form:form action="/result" method="post" modelAttribute="email">
      <table border="1">
        <tr>
          <th>Language</th>
          <td>
            <form:select path="language">
              <form:option value="English" name="language">English</form:option>
              <form:option value="Vietnamese" name="language">Vietnamese</form:option>
              <form:option value="Japanese" name="language">Japanese</form:option>
              <form:option value="Chinese" name="language">Chinese</form:option>
            </form:select>
          </td>
        </tr>
        <tr>
          <th>Page Size</th>
          <td> Show
            <form:select path="pageSize">
              <form:option value="5" name="pageSize">5</form:option>
              <form:option value="10" name="pageSize">10</form:option>
              <form:option value="15" name="pageSize">15</form:option>
              <form:option value="25" name="pageSize">25</form:option>
            </form:select>
            emails per page
          </td>
        </tr>
        <tr>
          <th>Spams filters</th>
          <td><form:radiobuttons path="spamFilters" items="${spamFilters}"/> Enable spams filter</td>
        </tr>
        <tr>
          <th>Signature</th>
          <td><form:input path="signature"/> </td>
        </tr>
        <tr>
          <td><button type="submit">update</button></td>
          <td><button type="button">cancel</button></td>
        </tr>
      </table>
    </form:form>
  </body>
</html>
