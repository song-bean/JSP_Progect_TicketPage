<%@page import="my.user.userDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	userDao udao = userDao.getInstance();
	
	String message, url;
	int cnt = udao.updatePwById(id, password); 
	if(cnt != -1){
		message = "비밀번호가 변경되었습니다.";
		url = request.getContextPath() + "/MY/Home/loginForm.jsp";
	}
	else{
		message = "비밀번호가 변경 실패";
		url = request.getContextPath() + "/MY/Home/home.jsp";
	}
	
%> 

<script type="text/javascript">
	alert('<%= message %>');
	location.href = '<%= url %>'; 
</script>