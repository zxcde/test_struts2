<%@page import="vkx.baogia.model.Job"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Homepage</title>
		<script src="<%=request.getContextPath() %>/js/jquery-1.11.3.min.js" ></script>
		<script src="<%=request.getContextPath() %>/js/bootstrap.min.js" ></script>
		<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel='stylesheet' type='text/css' />	
	</head>
	
	<body>
		<%
		String msg = (String)request.getParameter("message");
		if(msg!=null) out.println(msg);
		else out.println("NULL");
		%>
	
		<form action="doTest" method="post">
			<input type="text" name="job_name" size="30" placeholder="job_name" >
			<input type="text" name="job_desc" size="30" placeholder="job_desc" >
			<input type="submit" value="SUBMIT">
		</form>
	</body>
</html>