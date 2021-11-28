<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 13-Nov-21
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%--%><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
  <link rel="stylesheet" href="Bootstrap/css/bootstrap.css">
  <link rel="stylesheet" href="Bootstrap/js/bootstrap.js">
  <link rel="stylesheet" href="indexCSS.css">
</head>
<body>
<div class="header">
  <div class="header1">
    <div class="row">
      <div class="col-lg-10"><h1>Logo</h1></div>
      <div class="col-lg-2"><p>Nguyễn Cửu Quốc Huy</p></div>
    </div>
  </div>
  <div class="header2">
    <div class="row">
      <div class="col-lg-3"></div>
      <div class="col-lg-6">
        <form method="get">
          <a href="#">Home</a>
          <a href="#">Employee</a>
          <a href="/customers?action=list">Customer</a>
          <a href="#">Service</a>
          <a href="#">Contract</a>
        </form>
      </div>
      <div class="col-lg-3"><form method="get" style="align-items: center">
        <input type="hidden" name="action" value="search">
        <input name="name">
        <button type="submit">Search</button>
      </form>
      </div>
    </div>
  </div>
</div>
<div class="body">
  <div class="row">
    <div class="col-lg-3">
      <p>Item One</p>
      <p>Item Two</p>
      <p>Item Three</p>
      <a href="view/customer/create.jsp">add</a>
    </div>
    <div class="col-lg-9"></div>
  </div>
</div>

<div class="footer">Footer...</div>
</body>
</html>
