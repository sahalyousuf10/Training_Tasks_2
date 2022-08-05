<%@page import="com.sahal.web.model.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
	<%
	
	Student s1 = (Student)request.getAttribute("student");
	
	int id = s1.getSid();
	String name =s1.getSname();
	int marks = s1.getSmarks();
	
	
	%>
	<h1>Student Details</h1>
	<table style= "border-style: solid;" >
	
	<tr style= "border-style:  solid;">
	<td style= "border-style:  solid;">
	Student ID  
	</td>
	<td style= "border-style:  solid;">
	<%
	out.println(id);
	%>
	</td>
	</tr>
	
	
	<tr style= "border-style:  solid;">
	<td style= "border-style:  solid;">
	Student Name  
	</td>
	<td style= "border-style:  solid;">
	<%
	out.println(name);
	%>
	</td>
	</tr>
	
	
	<tr style= "border-style:  solid;">
	<td style= "border-style:  solid;">
	Student Marks  
	</td>
	<td style= "border-style:  solid;">
	<%
	out.println(marks);
	%>
	</td>
	</tr>
	</table>
	<br/>
	<br/>
	
	<form action ="<%= request.getContextPath()%>/back" method="post">
	
	<input type = "submit" value="Back" />
	
	</form>


</div>

</body>
</html>