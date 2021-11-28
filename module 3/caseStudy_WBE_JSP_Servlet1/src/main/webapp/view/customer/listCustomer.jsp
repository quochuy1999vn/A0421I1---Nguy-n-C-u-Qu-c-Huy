<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 18-Nov-21
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
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
                <a href="/customers?action=list">Customer</a>
                <a href="#">Service</a>
                <a href="#">Contract</a>
            </div>
            <div class="col-lg-3"><form action="/customers" method="get" style="align-items: center">
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
            <table border="1" cellpadding="5">
                <caption><h2>List of Customer</h2></caption>
                <tr>
                    <td>ID</td>
                    <td>Type ID</td>
                    <td>Name</td>
                    <td>Birthday</td>
                    <td>Gender</td>
                    <td>ID Card</td>
                    <td>Phone</td>
                    <td>Email</td>
                    <td>Address</td>
                </tr>

                <c:forEach var="customer" items="${customerList}">
                    <tr>
                        <td><c:out value="${customer.customer_id}"/></td>
                        <td><c:out value="${customer.customer_type_id}"/></td>
                        <td><c:out value="${customer.customer_name}"/></td>
                        <td><c:out value="${customer.customer_birthday}"/></td>
                        <td><c:out value="${customer.customer_gender}"/></td>
                        <td><c:out value="${customer.customer_id_card}"/></td>
                        <td><c:out value="${customer.customer_phone}"/></td>
                        <td><c:out value="${customer.customer_email}"/></td>
                        <td><c:out value="${customer.customer_address}"/></td>
                        <td>
                            <a href="/customers?action=edit&id=${customer.customer_id}">Edit</a>
                            <a href="/customers?action=delete&id=${customer.customer_id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

<div class="footer">Footer...</div>
</body>
</html>
