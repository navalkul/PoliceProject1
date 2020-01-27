<%@page import="java.util.function.Function"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Police Stations</title>
		
	<c:if test="${sessionScope.userName == null }" >">
		<c:redirect url="login.jsp" ></c:redirect>
	</c:if>
	
</head>
<body>

<div style="background: teal; height: 80vh ;">
	<div style="display: grid;justify-content: center;align-content: center;">
		<h1>Welcome to Home MasterAdmin <%= session.getAttribute("userName")%> </h1>
		
		<a href="logout.jsp">LogOut</a>
		
			<form action="pslist" method="post">
				<input type="submit" value="Show Police Stations">
			</form>
				
				<!--POLICE STATION LIST-->
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
				<tr>
					<th colspan="5">Police Station List</th>
				</tr>
				<tr>
					<th>Option</th>
					<th>Option</th>
					<th>Name</th>
					<th>Mob</th>
					<th>Desig</th>
					<th>Email</th>
					<th>Dob</th>
					<th>PoliceStationId</th>
					<th>RoleId</th>
				</tr>
			</thead>

			<c:forEach items="${poEmpList}" var="temp">
				<tr>
					<td>
						<form action="deleteAdmin" method="post" commandName="poId">
							<input type="hidden" value=${temp.emp_id} name="id">
							<input type="hidden" value=${temp.role_id} name="roleId">
							<input type="submit" value="Delete Admin">
						</form>
					</td>
					<td>
						<form action="assignAdmin" method="post" commandName="poId">
							<input type="hidden" value=${temp.emp_id} name="id">
							<input type="hidden" value=${temp.role_id} name="roleId">
							<input type="submit" value="Select Admin">
						</form>
					</td>
					<td>${temp.emp_name}</td>
					<td>${temp.emp_mob}</td>
					<td>${temp.emp_desig}</td>
					<td>${temp.emp_email}</td>
					<td>${temp.emp_dob}</td>
					<td>${temp.ps_id}</td>
					<td>${temp.role_id}</td>				
				</tr>
			</c:forEach>
			
		</table>
		

	</div>
</div>
</body>
</html>



<%-- 
<a href="login" >
			Logout <%=session.invalidate()%>
			<%	Function logOut()
			{
				
			}
			%>
		</a> --%>