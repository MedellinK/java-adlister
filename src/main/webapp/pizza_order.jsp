<%--
  Created by IntelliJ IDEA.
  User: kelvynmedellin
  Date: 5/10/23
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Order Pizza</h1>
<form action="pizza" method="post">
    <label for="crust">Crust Type</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="deep">Deep</option>
    </select>
    <br>
    <label for="sauce">Sauce Type</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato</option>
        <option value="bbq">BBQ</option>
        <option value="ranch">Ranch</option>
    </select>
    <br>
    <label for="size">Size Type</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br>
    <fieldset>
        <legend>Toppings</legend>
        <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
        <input type="checkbox" name="toppings" value="sausage">Sausage<br>
        <input type="checkbox" name="toppings" value="bacon">Bacon<br>
        <input type="checkbox" name="toppings" value="pineapple">Pineapple<br>
        <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
        <input type="checkbox" name="toppings" value="olives">Olives<br>
        <input type="checkbox" name="toppings" value="onions">Onions<br>
        <input type="checkbox" name="toppings" value="peppers">Peppers<br>
    </fieldset>
    <br>
    <label for="address">Delivery Address</label>
    <input type="text" name="address" id="address">
    <br>
    <input type="submit" value="Submit">
</form>

<c:if test="${pizza != null}">
    <h2>Order Summary</h2>
    <p>Crust: ${pizza.crust}</p>
    <p>Sauce: ${pizza.sauce}</p>
    <p>Size: ${pizza.size}</p>
    <c:forEach var="topping" items="${pizza.toppings}">
        <p>Topping: ${topping}</p>
    </c:forEach>
    <p>Address: ${pizza.address}</p>
</c:if>

</body>
</html>