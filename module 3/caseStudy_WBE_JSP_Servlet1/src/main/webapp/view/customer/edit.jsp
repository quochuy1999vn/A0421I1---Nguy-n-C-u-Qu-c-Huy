<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 20-Nov-21
  Time: 6:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Customer</title>
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
                <a href="#">Home</a>
                <a href="#">Employee</a>
                <a href="#">Customer</a>
                <a href="#">Service</a>
                <a href="#">Contract</a>
            </div>
            <div class="col-lg-3">
                <form action="/customer" method="get" style="align-items: center">
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
        </div>
        <div class="col-lg-9">
            <form method="post">
                <table border="1" cellpadding="5">
                    <caption><h2>Create of Customer</h2></caption>
                    <c:if test="${customer != null}">
                        <input type="hidden" name="id" value="<c:out value='${customer.customer_id}'/>">
                    </c:if>
                    <tr>
                        <th>User Name:</th>
                        <td><input type="text" name="name" id="name" size="45" value="${customer.customer_name}"></td>
                    </tr>
                    <tr>
                        <th>Birthday:</th>
                        <td><input type="text" name="birthday" id="birthday" size="45" value="${customer.customer_birthday}"></td>
                    </tr>
                    <tr>
                        <th>Gender:</th>
                        <td><input type="text" name="gender" id="gender" size="45" value="${customer.customer_gender}"></td>
                    </tr>
                    <tr>
                        <th>ID Card:</th>
                        <td><input type="text" name="idCard" id="idCard" size="45" value="${customer.customer_id_card}"></td>
                    </tr>
                    <tr>
                        <th>Phone:</th>
                        <td><input type="text" name="Phone" id="Phone" size="45" value="${customer.customer_phone}"></td>
                    </tr>
                    <tr>
                        <th>Email:</th>
                        <td><input type="text" name="email" id="email" size="45" value="${customer.customer_email}"></td>
                    </tr>
                    <tr>
                        <th>Address:</th>
                        <td><input type="text" name="address" id="address" size="45" value="${customer.customer_address}"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Save"/>
                        </td>
                        <td><a href="customers?action=list">Back</a></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
<div class="footer">Footer...</div>
</body>
</html>
