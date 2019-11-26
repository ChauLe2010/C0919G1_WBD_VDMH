<%--
  Created by IntelliJ IDEA.
  User: haili
  Date: 11/22/2019
  Time: 8:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<center>
    <h1>Product Discount Calculator</h1>
    <form method="post" action="/calculator">
        <label>Product Description</label><br/>
        <input type="text" name="description"><br/>
        <label>List Price</label><br/>
        <input type="text" name="price"><br/>
        <label>Discount Percent</label><br/>
        <input type="text" name="discount"><br/>
        <br/>
        <input type="submit" id="submit" value="Calculate Discount">
    </form>
</center>
</body>
</html>
