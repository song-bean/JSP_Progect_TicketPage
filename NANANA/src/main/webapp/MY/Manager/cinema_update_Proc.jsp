<%@page import="my.manager.cinema.CinemaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	CinemaDao cdao = CinemaDao.getInstance();
%>

<jsp:useBean id="cb" class="my.manager.cinema.CinemaBean"/>
<jsp:setProperty property="*" name="cb"/>
	
<%
	String message = null, url = null;
	int cnt = cdao.updateCinama(cb); 
	
	if(cnt != -1){
		message = "극장 수정 성공";
		url = "cinema_list.jsp";
	}
	else{
		message = "극장 수정 실패";
		url = "cinema_update.jsp";
	}
	
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>';
</script>
