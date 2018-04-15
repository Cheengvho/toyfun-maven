<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function jsondemo(){
	var json_string={uname:"上海sspu",upassword:"abc"}
	$.ajax({
		type:"POST",
		url:"./ajaxdemo",
		data:JSON.stringify(json_string),
		contentType:"application/json;charset=utf-8",
		success:function(data){
			alert(data.uname);
			
			alert("this");
			$("#showjson").html("uname:"+data.uname+"<br/>upassword:"+data.upassword);
		},
		error:function(r){
			alert("error");
		}
	});
}

function jsondemo2(){
	
	$.ajax({
		type:"GET",
		url:"./ajaxdemo2",
		data:"myname"+"shisis",
		dataType:'text',
		contentType:"text/plain;charset=utf-8",
		success:function(data){
			alert(data);
			$("#showjson2").html("测试中文传值:"+data);
		},
		error:function(r){
			alert("error");
		}
	});
}
</script>
</head>
<body>
	<buttion onclick="jsondemo()" style="border:1px solid #000000; cursor:point; ">点击这里显示返回值</buttion>
	<p id="showjson"></p>
	
	<buttion onclick="jsondemo2()" style="border:1px solid #000000; cursor:point; ">点击这里显示中文传值返回值</buttion>
	<p id="showjson2"></p>
</body>
</html>