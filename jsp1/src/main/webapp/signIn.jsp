<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- signIn -->

<%
	String id = request.getParameter("loginId");
	String pw = request.getParameter("loginPw");
	
	Connection conn=null;
	PreparedStatement pt=null;
	ResultSet rs=null;
	
	try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			String user = "jsy9845";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/jsy9845";
			conn=DriverManager.getConnection(url, user, password);
			
	} catch(Exception e) {
		System.out.println("드라이버 로드 실패 및 접속 실패");
		e.printStackTrace();
	}
	
	String sql = "select * from member1 where member_id=? and password=?";
	try{
		pt = conn.prepareStatement(sql);
		pt.setString(1, id);
		pt.setString(2, pw);
		rs = pt.executeQuery();
		if(rs.next()){ // 참이라면 로그인 성공, 거짓이라면 아이디 또는 암호 틀림
			// 아이디와 암호 일치하면 로그인처리
			out.print("<h1>로그인성공<h1>");
			// 로그인 유지 방법
			session.setAttribute("user", id);
			response.sendRedirect("main.jsp");
		} else {// 아이디 또는 암호 틀림
				%>
					<script>
							let select = confirm("아이디 또는 회원가입이 잘못되었습니다.\n 회원가입 하시겠습니까?");
							if(select) // 예라면 회원가입
								location.href="main.jsp?show=join";
							else //아니라면 다시 로그인
								location.href="main.jsp?show=login";
					</script>
				<%
		}
	} catch(Exception e) {
			System.out.println("아이디 암호 조회 실패");
			e.printStackTrace();
	}
%>    