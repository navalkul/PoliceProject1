<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Police Stations</title>
</head>
<body>
	<div style="display: grid;justify-content: center;align-content: center;">
		<h1>Welcome to Home</h1>

		<form action="pslist" method="post">
			<input type="submit" value="Show Police Stations">
		</form>
		
		<table border="1">
		
			<thead>
				<tr><th colspan="5">Police Station List</th></tr>
				<tr>
					<th>PSName</th>
					<th>PSAdd</th>
				</tr>
			</thead>

			<c:forEach items="${psList}" var="temp">
				<tr>
					
					<td>${temp.ps_Name}</td>
					<td>${temp.ps_Address}</td>
					<td>
						<form action="poList" method="post" commandName="poId">
							<input type="hidden" value=${temp.ps_Id} name="id">
							<input type="submit" value="select">
						</form>
					</td>
					<!--  <td><a href="particularPoliceStation.jsp?ps_Id=${temp.ps_Id}">Select</a></td>-->
				</tr>
			</c:forEach>
			
		</table>
		
		<br><br><br><br>
		
		
		<table border="1">
		
			<thead>
				<tr><th colspan="5">Police Station List</th></tr>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Mob</th>
					<th>Desig</th>
					<th>Email</th>
					<th>Dob</th>
					<th>Id</th>
				</tr>
			</thead>

			<c:forEach items="${poEmpList}" var="temp">
				<tr>
					<td>${temp.emp_id}</td>
					<td>${temp.emp_name}</td>
					<td>${temp.emp_mob}</td>
					<td>${temp.emp_desig}</td>
					<td>${temp.emp_email}</td>
					<td>${temp.emp_dob}</td>
					<td>${temp.ps_id}</td>					
				</tr>
			</c:forEach>
			
		</table>
		

	</div>
</body>
</html>