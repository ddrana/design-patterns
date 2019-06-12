<%@page import="com.learn.design.pattern.java.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Record</title>
</head>
<body>

<%
	if( request.getAttribute("studentRecord") != null) {
		Student student = (Student)request.getAttribute("studentRecord");
%>

<h1>Student Record</h1>
<div>ID: <%= student.getId()%></div>
<div>Name: <%= student.getFirstName()%></div>
<%
	}
%>

</body>
</html>