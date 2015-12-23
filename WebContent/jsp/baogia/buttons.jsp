<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Thêm HH</button>
<br/><br/><br/>
<!-- Modal content-->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog modal-lg">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Bổ sung hàng hóa</h4>
      </div>
      <div class="modal-body">
      	
      	<form class="form-horizontal">
      		<div class="form-group">
		      	<label class="col-sm-2 control-label">Phân loại</label>
		      	<div class="col-sm-10">
			      	<select class="form-control">
			      		<option>PL1</option>
			      		<option>PL2</option>
			      	</select>
		      	</div>
      		</div>
      	</form>
      	
      	<table id="tblData" class="table table-bordered">
			<thead>
				<tr class="info">
					<th>Chọn</th>
					<th>Tên</th>
					<th>Quy cách</th>
				</tr>
		    </thead>
		    <tbody id="tblData_body">
		    	<tr>
		    		<td>chon1</td>
		    		<td>ten1</td>
		    		<td>quycach1</td>
		    	</tr>
		    </tbody>
		    <tbody id="tblData_body">
		    	<tr>
		    		<td>chon2</td>
		    		<td>ten2</td>
		    		<td>quycach2</td>
		    	</tr>
		    </tbody>
		    <tbody id="tblData_body">
		    	<tr>
		    		<td>chon3</td>
		    		<td>ten3</td>
		    		<td>quycach3</td>
		    	</tr>
		    </tbody>
		</table>
      	
      </div>
      <div class="modal-footer">
      	<button type="button" class="btn btn-default" data-dismiss="modal" onclick="chon();">Chọn</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
      </div>
    </div>

  </div>
</div>

<script>
function chon(){
	console.log("AAAAAAAAAAC");
}
</script>