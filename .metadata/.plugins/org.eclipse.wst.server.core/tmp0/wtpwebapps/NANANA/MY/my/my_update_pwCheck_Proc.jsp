<%@page import="my.user.userDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String sid = (String)session.getAttribute("sid");
	String input_password = request.getParameter("password");
	
	userDao udao = userDao.getInstance();
	String db_password = udao.getPwById(sid); 
	
	String message = null, url = null;
	if(db_password.equals(input_password)){
		response.sendRedirect(request.getContextPath() + "/MY/my/my_update.jsp");
	}
	else{
%>
		<script type="text/javascript">
			alert('비밀번호가 일치하지 않습니다.');
			location.href= '<%= request.getContextPath() %>/MY/my/my_update_pwCheck.jsp'; 
		</script>
<%		
	}
%>
