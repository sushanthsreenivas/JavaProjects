<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome, <c:out value="${requestScope.ub.firstName} ${requestScope.ub.lastName}"></c:out>!</br>
<iframe width="20%" height="400" src="toc12323.jsp"></iframe>
<iframe width="75%" height="400" name="content"></iframe>
</body>
</html>