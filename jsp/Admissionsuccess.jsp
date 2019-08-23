<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>${hedermessage}</h1>

<h2>details subbmiteed by you</h2>

<table>
<tr>
<td>student Name</td>
<td>${student.studentname}</td>
</tr>
<tr>
<td>student Hobby</td>
<td>${student.studenthobby}</td>
</tr>
<tr>
<td>student mobile no</td>
<td>${student.mobileno}</td>
</tr>

</table>
	
</body>
</html>