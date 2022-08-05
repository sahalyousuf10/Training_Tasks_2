<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>Register Student</h1>
		<form action ="<%= request.getContextPath()%>/register" method="post">
		<table>
		<tr>
		<td>ID</td>
		<td><input type="text" name="sid" /></td>
		</tr>
		
		<tr>
		<td>Name</td>
		<td><input type="text" name="sname" /></td>
		</tr>
		
		<tr>
		<td>Marks</td>
		<td><input type="text" name="smarks" /></td>
		</tr>
		</table>
		<br/><br/>
		<input type = "submit" value="Submit" />
		
		</form>
		
		<h1>Delete Student</h1>
		<form action="<%= request.getContextPath()%>/delete" method="post">
	
		<table>
		<tr>
		<td>ID</td>
		<td><input type="text" name="sid2" /></td>
		</tr>
	
		</table>
		<br/><br/>
		<input type = "submit" value="Delete" />
		</form>
		
		<h1>Update Student</h1>
		<form action ="<%= request.getContextPath()%>/update" method="post">
		<table>
		<tr>
		<td>ID</td>
		<td><input type="text" name="sid3" /></td>
		</tr>
		
		<tr>
		<td>Name</td>
		<td><input type="text" name="sname2" /></td>
		</tr>
		
		<tr>
		<td>Marks</td>
		<td><input type="text" name="smarks2" /></td>
		</tr>
		</table>
		<br/><br/>
		<input type = "submit" value="Update" />
		
		</form>
		
	
	
		<h1>Check Student Details</h1>

		<form action="getStudent">
		ID
		<input type="text" name="sid4"><br/><br/>
		<input type="submit">

		</form>
		
		</div>

	

</body>
</html>