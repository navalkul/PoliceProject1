<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PoliceStationManipulation</title>
<% 
	int id = Integer.parseInt(request.getParameter("ps_Id")); 
%>

</head>

<body>

	<h1>${PoliceStation}</h1>
	
	<form action="policeEmpList" method="post">
		<input type="text" placeholder=<%=id%> name="ps_id"/>
		<input type="submit" value="submit"	>
	</form>
	
</body>
</html>