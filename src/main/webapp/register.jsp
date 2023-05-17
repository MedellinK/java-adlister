<%--
  Created by IntelliJ IDEA.
  User: kelvynmedellin
  Date: 5/17/23
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
<h1>Create Account</h1>
    <form action="/login" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" required>
        <br>
        <label for="password">Password:</label>
        <input type="text" name="password" id="password" required>
        <br>
        <label for="email">Email:</label>
        <input type="text" name="email" id="email" required>
        <br>
        <input type="submit" value="Create Account">
    </form>
</body>
</html>
