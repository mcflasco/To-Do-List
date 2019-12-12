<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="item.*, java.util.ArrayList"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Lora&display=swap" rel="stylesheet">
<link href="style.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>To Do List</title>

<%
	String item = request.getParameter("item");
	
	Item test = new Item();
	ToDoItem.addItem(item);  
	
	Item items = null;
	int i = 0;
	for(i = 0; i < test.items.size();i++){
		items = test.items.get(i);
	}
%>

</head>
<body>
	<h1>Your To Do List</h1>
	<form name="list" action="results.jsp" method="">
<table>
		<p class="hover"><%= test.items.get(0) %></p>
		<p class="hover"><%= test.items.get(1) %></p>
		<p class="hover"><%= test.items.get(2) %></p>
		<p class="hover"><%= ToDoItem.listItems() %></p>


		</table>
		
		<input type="button" value="delete" name="delete" />
			
	</form>
</body>
</html>