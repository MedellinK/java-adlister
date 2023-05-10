<%--
  Created by IntelliJ IDEA.
  User: kelvynmedellin
  Date: 5/9/23
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Create a Blog Post"/>
</jsp:include>

<body>

<jsp:include page="/partials/navbar.jsp"/>
<div class="container">

<h1>Create a Blog Post</h1>
<form action="/createPost" method="post">
    <label for="title">Title</label>
    <input type="text" name="title" id="title">
        <textarea name="post" class="form-control" id="body"></textarea>
    <input type="submit" value="submit">
</form>
    <c:if test="${post != null}">
        <h2>Your Blog Post:</h2>
        <h3>${post.title}</h3>
        <p>${post.post}</p>
    </c:if>
</div>
</body>
</html>
