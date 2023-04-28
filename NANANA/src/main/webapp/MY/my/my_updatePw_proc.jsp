<%@ page import="my.user.userDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String sid = (String)session.getAttribute("sid");
	String password = request.getParameter("password");
	userDao udao = userDao.getInstance();
	
	String message, url;
	int cnt = udao.updatePwById(sid, password); 
	if(cnt != -1){
		message = "비밀번호가 변경되었습니다.";
		url = request.getContextPath() + "/MY/my/mypage.jsp";
	}
	else{
		message = "비밀번호가 변경 실패";
		url = request.getContextPath() + "/MY/my/my_updatePw.jsp";
	}
	
%> 

<script type="text/javascript">
	alert('<%= message %>');
	location.href = '<%= url %>'; 
</script>