<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<input type="text" name="username">
<input type="text" name="username">
<input type="submit" value="GO!">
</form>
Hello, <s:out value="${paramValues.username[0]} ${paramValues.username[1]}"/>
<table>
<s:forEach begin="0" end="10" var="count">
<tr><td><s:out value="${count}"/></td></tr>
</s:forEach>
</table>

</body>
</html>