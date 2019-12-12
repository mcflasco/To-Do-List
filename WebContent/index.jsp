<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="item.*, java.util.ArrayList" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>



<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Lora&display=swap" rel="stylesheet">
<link href="style.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>To Do List</title>
</head>
<body>

<%
	String item = request.getParameter("item");
	Class.forName("com.mysql.jdbc.Driver");
	
%>

<div class="container">

	<h1>To Do List</h1>
	
		
			<form method="POST" action="./Controller">
			<table>
				<p class="new_item">New Item:</p>
				<input type="text" name="item" value="" size="50"/>		
				<div>	
				<button type="submit" value="submit" name="submit" class="btn btn-primary">Submit</button>
				<button type="reset" value="clear" name="clear" action="results.jsp" class="btn btn-primary">Clear</button>
				</table>
			</form>
			
		</div>
</div>
</body>
</html>


