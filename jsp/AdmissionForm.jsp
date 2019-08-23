<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<center>
<h1>please enter the student Details</h1>

<form:form name="studentdetails" modelAttribute="generalmodel" method="post" >

<p> Student Enrollement:- <input type="text" name="student.enroll" /> </p>

<p> Student name:- <input type="text" name="student.studentname" /> </p>

<p> Student Hobby <input type="text" name="student.studenthobby" /> </p>

<p> Student Mobile No <input type="text" name="student.mobileno" /> </p>

<input type="submit" id="btnSave" onclick="savestudent();" value="save"></a>
</form:form> 
</center>

<script type="text/javascript">
function savestudent(){
		alert("do you want to submit code");	
		document.studentdetails.action="../student/submitaddmissionform.htm";
		document.studentdetails.submit();
		}
</script>
