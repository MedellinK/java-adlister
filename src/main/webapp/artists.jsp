<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kelvynmedellin
  Date: 5/15/23
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="artist" items="${artists}">
    <p>${artist.artistName}</p>
    <p>${artist.recordName}</p>
</c:forEach>

</body>
</html>
