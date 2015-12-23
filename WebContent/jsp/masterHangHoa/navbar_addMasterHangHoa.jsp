<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	        </button>
	        <a class="navbar-brand" href="#">Thêm hàng hóa</a>
	    </div>
	    <div class="collapse navbar-collapse">
	        <form class="navbar-form navbar-left">
	            <div class="form-group">
	                <input type="text" id="phanloai" class="form-control" placeholder="Phân loại">
	            </div>
	            <div class="form-group">
	                <input type="text" id="ten" class="form-control" placeholder="Tên">
	            </div>
	            <div class="form-group">
	                <input type="text" id="quycach" class="form-control" placeholder="Quy cách">
	            </div>
	            <div class="form-group">
	                <input type="text" id="donvi" class="form-control" placeholder="Đơn vị">
	            </div>
	            <div class="form-group">
	                <input type="text" id="nguyengia" class="form-control" placeholder="Nguyên giá" onkeypress='return event.charCode >= 48 && event.charCode <= 57'>
	            </div>
	            <button type="button" class="btn btn-success" onclick="addEmptyRow();">Thêm hàng hóa</button>
	        </form>
	    </div>
	</nav>
</div>
