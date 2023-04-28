<%@page import="my.user.userDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	userDao udao = userDao.getInstance();
%>

<jsp:useBean id="user" class="my.user.userBean" />
<jsp:setProperty property="*" name="user" />

<%	
	String message = null, url = null; 
	int cnt = udao.updateUser(user); 
	if(cnt == 1){
		response.sendRedirect(request.getContextPath() + "/MY/my/my_detail.jsp");
	}
	else{
		message = "화원 정보 수정 실패";
		url = request.getContextPath() + "/MY/Home/home.jsp";
	}	
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>'; 
</script>