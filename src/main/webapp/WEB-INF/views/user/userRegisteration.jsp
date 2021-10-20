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
	<form id="joinFormMain" action="/userJoin" method="post">
		<div id="joinForm">
		이름 <br />
		<input class="userInput" id="user_name" name="user_name" type="text"><br />
		<div>아이디</div> 
		<div>
		<input class="userInput" id="user_id" name="user_id" type="text">
		</div>
		<span class="id_input_re_1">사용 가능한 아이디입니다.</span>
		<span class="id_input_re_2">아이디가 이미 존재합니다.</span>
		<div>이메일</div> 
		<input class="userInput" id="user_email" name="user_email" type="text"><br />
		비밀번호 <br />
		<input class="userInput" id="user_password" name="user_password" type="password"><br />
		비밀번호확인 <br />
		<input class="userInput" id="user_password_check" name="user_password_check" type="password"><br />
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
			console.log("성공여부" + result);
			
			if(result != 'fail'){
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display","none");
				
			} else{
				$('.id_input_re_2').css("display","inline-block");
				$('.id_input_re_1').css("display","none");
			
			}
			
		}
	}); 

});// 아이디중복검사 function 종료

$('#submit').on("click", function(){ 
	
	var userId = $('#user_id').val();
	var userName = $('#user_name').val();
	var userEmail = $('#user_email').val();
	var userPw = $('#user_password').val();
	var userPwCheck = $('#user_password_check').val();
	
	if(userName == '') return alert("이름을 입력하세요")
	if(userId == '') return alert("아이디를 입력하세요")
	if(userEmail == '') return alert("이메일을 입력하세요")
	if(userPw == '') return alert("패스워드를 입력하세요")
	if(userPwCheck == '') return alert("패스워드를 확인하세요")
	
	
	
});


</script>

</body>
</html>