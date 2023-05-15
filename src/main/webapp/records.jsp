<%--
  Created by IntelliJ IDEA.
  User: kelvynmedellin
  Date: 5/15/23
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="record" items="${records}">
     <div class="record">
    <p> ${record.id} </p>
    <p> ${record.recordName} </p>

    </div>
</body>
</html>
