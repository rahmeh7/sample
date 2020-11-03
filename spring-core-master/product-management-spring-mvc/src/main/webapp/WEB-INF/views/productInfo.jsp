<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    
    
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>  ${msg}  </h2>

<%-- <form:errors path="product.*"></form:errors> --%>

<form:form action="insertProduct" method="post" modelAttribute="product">


Product Id <form:input type="text"  path="productId" ></form:input> <br>

<form:errors path="productId"></form:errors> <br>

Product Name <form:input type="text" path="productName"></form:input> <br>

<form:errors path="productName"></form:errors> <br>

Product Cost <form:input  type="text"  path="productCost"></form:input> <br>

<form:errors path="productCost"></form:errors> <br>
<br>

<input type="submit" value="submit">

</form:form>
</body>
</html>