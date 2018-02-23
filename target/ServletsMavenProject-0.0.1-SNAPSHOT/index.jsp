<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="attribute.PersonPojo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<PersonPojo> list = (List<PersonPojo>) request.getAttribute("personlist"); %>

<table style="width: 300px">
	<% for(PersonPojo p : list) { %>
	<tr>
		<td><%= p.getId() %></td>
		<td><%= p.getName() %></td>
		<td><%= p.getSurname() %></td>
		<td><%= p.getPhoneNumber() %></td>	
	</tr>
	<%} %>


</body>
</html>