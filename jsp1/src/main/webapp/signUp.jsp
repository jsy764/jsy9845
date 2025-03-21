<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String myId=request.getParameter("id");
	String myPw=request.getParameter("pw");
	String myBirth=request.getParameter("birth");
	String myEmail=request.getParameter("email");
	
	Connection conn=null;
	PreparedStatement pt=null;
	ResultSet rs=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "jsy9845";
		String password = "1234";
		String url="jdbc:mysql://localhost:3306/jsy9845";
		conn=DriverManager.getConnection(url, user, password);
	}catch(Exception e){
		System.out.println("드라이버 로드 실패 및 접속 실패");
		e.printStackTrace();
	}
	String sql="select * from member1 where member_id='"+myId+"'";
	try{
		pt=conn.prepareStatement(sql);
		rs=pt.executeQuery();
		if(rs.next()){// 참이면 아이디가 중복이라는 뜻이고, 거짓이라면 중복이 아니다.
			// 아이디가 중복이라면 회원가입을 다시하게 해줄것
			// 다시 회원가입 양식 페이지로 이동해야한다.
			// 이동시키는 방법으로 javascript 또는 내장객체를 사용하는 방법이 있다.
			%>
				<script>
						/* alert("아이디가 중복");
						//history.back();
						location.href="main.jsp"*/
				</script>
			<%
			response.sendRedirect("main.jsp");
			return;
		}
	}catch(Exception e){
		System.out.println("아이디 중복 확인 조회 실패");
	}
	
	// 아이디가 중복이 아니니까 회원가입 내용 테이블에 저장 시키기
	
	sql="insert into member1(member_id, email, password, birth)"+ 
		"values('"+myId+"', '"+myEmail+"', '"+myPw+"', '"+myBirth+"')";
	try{
		pt=conn.prepareStatement(sql);
		pt.executeUpdate();
	}catch(Exception e){
		System.out.println("회원가입 테이블 저장 실패");
		e.printStackTrace();
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
				<h2> 회원가입 완료 </h2>
				<h3> 회원 가입 내용 </h3>
				<ul>
					<li>아이디 : <%=myId %></li>
					<li>비밀번호 : <%=myPw %></li>
					<li>생년월일 : <%=myBirth %></li>
					<li>이메일 : <%=myEmail %></li>
				</ul>
</body>
</html>