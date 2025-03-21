<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
		// main.jsp페이지를 열면 처음에 로그인하기 버튼과 회원가입하기 버튼 두개만 보여야한다.
		// 로그인하기 버튼 클릭하면 로그인 양식 보여야하고 회원가입하기 버튼 클릭하면 로그인 양식은 안보이고 회원가입 양식만 보여야한다.
<%
		String show = request.getParameter("show");
		if(show==null)
			show="";
%>
window.onload=function(){
	
			let loginOn = document.getElementById("signIn");
			let signOn = document.getElementById("signUp");
			
			loginOn.style.display="<%=show.equals("login") ? "block" : "none" %>";
			signOn.style.display="<%=show.equals("join") ? "block" : "none" %>";
			
			let loginform = document.getElementById("LoginOn");
			let joinform = document.getElementById("joinOn");
			
			loginform.addEventListener("click", function(){
				loginOn.style.display="block";
				signOn.style.display="none";
			});
			joinform.addEventListener("click", function(){
				loginOn.style.display="none";
				signOn.style.display="block";
			});	
		}

</script>
</head>
<body>
		<%
			String userId=(String)session.getAttribute("user");
			if(userId != null){
					out.print("<b>너의 심장에 박힌 이름 : "+userId+"</b>");	
			}
		%>
		<div id="nav">
				<input type="button" value="로그인하기" id="LoginOn"> 
				<input type="button" value="회원가입하기" id="joinOn">
		</div>
		
		<div id="signIn">
				<h2>너의 마음속에 로그인</h2>
				<form method="post" action="signIn.jsp">
						아이디 : <input type="text" name="loginId"> <br>
						비밀번호 : <input type="password" name="loginPw"> <br>
						<button>로그인</button>
				</form>
		</div>
		<div id="signUp">
		<h2>너의 마음에 가입</h2>
		<form method="post" action="signUp.jsp">
				아이디 : <input type="text" name="id" placeholder="아이디를 입력하세요"> <br>
				비밀번호 : <input type="password" name="pw"> <br>
				생년월일 : <input type="data" name="birth" value="2000-12-14"
					 min="1950-01-01" max="2008-12-31"> <br>
				이메일 : <input type="email" name="email"> <br>
				<button>가입</button>
		</form>
		</div>
</body>
</html>