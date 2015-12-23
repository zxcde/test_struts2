<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Master hàng hóa</title>
		<script src="<%=request.getContextPath() %>/js/jquery-1.11.3.min.js" ></script>
		<script src="<%=request.getContextPath() %>/js/bootstrap.min.js" ></script>
		<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel='stylesheet' type='text/css' />	
	</head>
	
	<style>
		#datadiv {
		    position:absolute;
		    top: 20%;
		    left: 5%;
		    width: 90%;
		}
	</style>
	
	<body>
		<div>
			<!-- Navbar -->
			<jsp:include page="navbar_addMasterHangHoa.jsp" />
			<!-- End Navbar -->
			
			<!-- Table Data -->
			<div id="datadiv">
				<form action="saveMHH" method="post">
					<table id="tblData" class="table table-bordered">
						<thead>
							<tr class="info">
								<th>Chọn <input type="checkbox" onchange="checkAll(0)" id="check0"></th>
								<th>Phân loại</th>
								<th>Tên</th>
								<th>Quy cách</th>
								<th>Đơn vị</th>
								<th>Nguyên giá</th>
								<th>Loại bỏ <input type="checkbox" onchange="checkAll(6)" id="check6"></th>
							</tr>
					    </thead>
					    <tbody id="tblData_body">
					    	<!-- <input type="text" onc> -->
					    </tbody>
					</table>
				</form>
				
				<center>
					<div class="btn-group">
					  <button type="button" class="btn btn-primary" onclick="copyRow();">Copy Dòng</button>
					  <button type="button" class="btn btn-primary" onclick="deleteRow();">Xóa Dòng</button>
					  <button type="button" class="btn btn-primary" >Ghi</button>
					  <button type="button" class="btn btn-primary">Kết thúc</button>
					</div>
				</center>
				<br/>
			</div>
			<!-- End Table Data -->
		</div>
	</body>
	
	<script src="<%=request.getContextPath() %>/js/baogia_masterHangHoa.js" ></script>

</html>