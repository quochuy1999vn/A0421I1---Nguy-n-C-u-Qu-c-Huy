<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quoch
  Date: 08-Dec-21
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Language: ${language}</h1>
<h1>Page Size: ${pageSize}</h1>
<h1>Spam filters: ${spamFilters}</h1>
<h1>Signature: ${email.signature}</h1>
</body>
</html>
