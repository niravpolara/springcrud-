<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table width="100%" id="employeelist" border="1">
		<thead>
			<tr>
				<th>Sr No</th>
				<th>studentenroll No.</th>
				<th>Student Name</th>
				<th>Student Hobby</th>
				<th>Student MobileNo</th>				
			</tr>
		</thead>
        	
		<tbody>
			<c:if test="${requestScope.studentlist ne null }">
				
				<c:forEach items="${requestScope.studentlist}" var="list" varStatus="listcnt">
					<tr>
						<td>${listcnt.count}</td>
						<td>${list.enroll}</td>
						<td>${list.studentname}</td>
						<td>${list.studenthobby}</td>
						<td>${list.mobileno}</td>
					</tr>
				</c:forEach>
			</c:if> 
		</tbody>
			
	</table>

</body>
</html>