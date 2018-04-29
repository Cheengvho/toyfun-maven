<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table th,td{border:1px solid #000;}
</style>

<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function showList(){
	$.ajax({
		type:"POST",
		url:"./TicketAjaxDemo",
		data:"",
		contentType:"text/plain;charset=utf-8",
		success:function(data){
			var listcode = "<tr><tr><th>Tid</th><th>departure_add</th><th>destination_add</th><th>departure_time</th><th>arrival_time</th><th>price</th><th>uname_code</th></tr></tr>";
			for(var i=0;i<data.length;i++){
				listcode+="<tr><td>"+data[i].tid+"</td><td>"+data[i].departure_add+"</td><td>"+data[i].destination_add+"</td><td>"+data[i].departure_time+"</td><td>"+data[i].arrival_time+"</td><td>"+data[i].price+"</td><td>"+data[i].uname_code+"</td></tr>";
			}
			$("#list").html(listcode);
		},
		error:function(r){
			alert("error");
		}
	});
}


</script>
</head>
<body>
	<button onclick="showList()" style="border:1px solid #000000; cursor:point; ">点击这里显示列表</button>
	<table id="list"></table>
	
	
</body>
</html>