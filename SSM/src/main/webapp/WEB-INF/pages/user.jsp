<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/insert" method="post">
		<input type="text" name="userName"></br>
		<input type="text" name="userAge">
		<input type="button" id="insert">
	</form>
	<button id="findOne" style="width:100px;height:20px">查找一个</button>
</body>
<script type="text/javascript" src="../js/jquery-1.7.1.js"></script>
<script type="text/javascript">
	$("#findOne").on("click",function(){
		console.log("you have clicked");
		$.ajax({
			url:"findOne/1",
			type:"post",
			data:"userId=2",
			dataType:"json",
			success:function(result,state){
				console.log(result);
				console.log(state);
			},
			error:function(result){
				
			}
		});
	});
</script>
</html>