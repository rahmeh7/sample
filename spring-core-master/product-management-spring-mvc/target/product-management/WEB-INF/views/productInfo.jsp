<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>  ${msg}  </h2>
<form action="insertProduct" method="post">

Product Id <input type="text" name="productId"> <br>

Product Name <input type="text" name="productName"> <br>

Product Cost <input type="text" name="productCost"> <br>

<br>

<input type="submit" value="submit">

</form>
</body>
</html>