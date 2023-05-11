
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ads</h1>
<c:forEach var="ad" items="${ads}">
    <p>${ad.id}</p>
    <p>${ad.userId}</p>
    <p>${ad.title}</p>
    <p>${ad.description}</p>
</c:forEach>

</body>
</html>
