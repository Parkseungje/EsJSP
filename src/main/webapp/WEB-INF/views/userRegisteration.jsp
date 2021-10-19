<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/user/user.css" />
<title>UserRegisteration</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>
	<p id="joinTitle">회원가입</p>
	<form action="/userJoin" method="post">
		<div id="joinForm">
		이름 <br />
		<input class="userInput" name="user_name" type="text"><br />
		<div>아이디</div> 
		<div>
		<input class="userInput" id="user_id" name="user_id" type="text">
		</div>
		<span class="id_input_re_1">사용 가능한 아이디입니다.</span>
		<span class="id_input_re_2">아이디가 이미 존재합니다.</span>
		<div>이메일</div> 
		<input class="userInput" name="user_email" type="text"><br />
		비밀번호 <br />
		<input class="userInput" name="user_password" type="text"><br />
		비밀번호확인 <br />
		<input class="userInput" id="user_password_check" type="text"><br />
		<input id="submit" type="submit" value="회원가입"> 
		<input type="button" value="메인으로" onclick="history.back(-1);">
		</div>
	</form>

<script type="text/javascript">

//아이디 중복검사
$('#user_id').on("propertychange change keyup paste input", function(){

	//console.log("keyup 테스트");	
	
	var userId = $('#user_id').val();
	var data = {userId : userId}
	
	$.ajax({
		type : "post",
		url : "/idCheck",
		data : data,
		success : function(result){
			//console.log("성공여부" + result);
			if(result != 'fail'){
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display","none");
			} else{
				$('.id_input_re_2').css("display","inline-block");
				$('.id_input_re_1').css("display","none");
			}
		}
	}); 

});// function 종료
</script>

</body>
</html>