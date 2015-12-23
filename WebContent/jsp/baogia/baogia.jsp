<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Báo Giá</title>
		<script src="<%=request.getContextPath() %>/js/jquery-1.11.3.min.js" ></script>
		<script src="<%=request.getContextPath() %>/js/bootstrap.min.js" ></script>
		<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel='stylesheet' type='text/css' />	
	</head>
	<body>
	
		<div id="form" style="margin-top: 5%; margin-left: 10%; width: 70%; float: left;">
			<jsp:include page="form.jsp" />
		</div>
		<br/>
		
		<div id="table" style="margin-top: 5%; margin-left: 10%; margin-right: 10%;">
			<jsp:include page="table.jsp" />
		</div>
		
		<div id="buttons" style="margin-top: 5%; margin-left: 10%; margin-right: 10%;">
			<jsp:include page="buttons.jsp" />
		</div>
		
	</body>
</html>