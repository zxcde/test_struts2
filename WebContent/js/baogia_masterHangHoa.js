function compareRow(rowi, rowj){
	for(var k=1;k<=5;k++){
		var valueki = rowi.cells[k].firstChild.value.trim();
		var valuekj = rowj.cells[k].firstChild.value.trim();
		if(valueki.localeCompare(valuekj)>0) return 1;
		else if(valueki.localeCompare(valuekj)<0) return -1;
	}
	return 0;
}

function swapRow(rowi, rowj){
	for(var i=0;i<7;i++){
		var contentRowi = rowi.cells[i].firstChild;
		var contentRowj = rowj.cells[i].firstChild;
		if(i==0||i==6){
			var tmp = contentRowi.checked;
			contentRowi.checked = contentRowj.checked;
			contentRowj.checked = tmp;
		}else{
			var tmp = contentRowi.value;
			contentRowi.value = contentRowj.value;
			contentRowj.value = tmp;
		}
	}
}

function sortTable(){
	var rows = $("#tblData").find("tbody>tr");
    var rowsLen = rows.length;
    for(var i=0;i<rowsLen-1;i++){
    	for(var j=i+1;j<rowsLen;j++){
    		var rowi = rows[i];
    		var rowj = rows[j];
    		if(compareRow(rowi, rowj)>0){
    			swapRow(rowi, rowj);
    		}
    	}
    }
}

//***************************************Add Row********************************************
function setRowValue(chon,phanloai, ten, quycach, donvi, nguyengia,loaibo){
	var rows = $("#tblData").find("tbody>tr");
	var lastRow = rows[rows.length-1];
	lastRow.cells[0].firstChild.checked = chon;
	lastRow.cells[1].firstChild.value = phanloai;
	lastRow.cells[2].firstChild.value = ten;
	lastRow.cells[3].firstChild.value = quycach;
	lastRow.cells[4].firstChild.value = donvi;
	lastRow.cells[5].firstChild.value = nguyengia;
	lastRow.cells[6].firstChild.checked = loaibo;
}

function addRow(chon,phanloai, ten, quycach, donvi, nguyengia,loaibo){
	row = "<tr>";	
	row+="<td><input type='checkbox' name='chon' /></td>";			
	row+="<td><input type='text' name='phanloai' onchange='sortTable();' /></td>";
	row+="<td><input type='text' name='ten' onchange='sortTable();' /></td>";
	row+="<td><input type='text' name='quycach' onchange='sortTable();' /></td>";
	row+="<td><input type='text' name='donvi' onchange='sortTable();' /></td>";
	row+="<td><input type='text' name='nguyengia' onchange='sortTable();' /></td>";	
	row+="<td><input type='checkbox' name='loaibo' /></td>";	
	row+="</tr>";
	
	var tblLength = $('#tblData tbody').children().length;
	if(tblLength>0){
		$('#tblData tr:last').after(row);
	}else{
		$('#tblData tbody').append(row);
	}
	
	setRowValue(chon, phanloai, ten, quycach, donvi, nguyengia, loaibo);
}

function addEmptyRow(){
	var phanloai = $.trim($('#phanloai').val());
	var ten = $.trim($('#ten').val());
	var quycach = $.trim($('#quycach').val());
	var donvi = $.trim($('#donvi').val());
	var nguyengia = $.trim($('#nguyengia').val());
	addRow(false,phanloai, ten, quycach, donvi, nguyengia,false);
	sortTable();
}

//***************************************End Add Row********************************************

function deleteRow(){
	var rows = $("#tblData").find("tbody>tr");
    for(var i=rows.length-1;i>=0;i--){
    	var row = rows[i];
    	var value0i = row.cells[0].firstChild.checked;
    	if(value0i) row.parentNode.removeChild(row);
    }
}

function copyRow(){
	var rows = $("#tblData").find("tbody>tr");
    var rowsLen = rows.length;
    for(var i=0; i<rowsLen; i++){
    	var row = rows[i];
    	var value0i = row.cells[0].firstChild.checked;
    	if(value0i){
    		var phanloai = row.cells[1].firstChild.value.trim();
    		var ten = row.cells[2].firstChild.value.trim();
    		var quycach = row.cells[3].firstChild.value.trim();
    		var donvi = row.cells[4].firstChild.value.trim();
    		var nguyengia = row.cells[5].firstChild.value.trim();
    		addRow(false,phanloai, ten, quycach, donvi, nguyengia,false);
    	}
    }
    sortTable();
}

//************************************************************************
function checkAll(index){
	var currentValue = $("#check"+index).is(':checked');
    var rows = $("#tblData").find("tbody>tr");
    var rowsLen = rows.length;
    for(var i=0; i<rowsLen; i++){
    	rows[i].cells[index].firstChild.checked = currentValue;
    }
}