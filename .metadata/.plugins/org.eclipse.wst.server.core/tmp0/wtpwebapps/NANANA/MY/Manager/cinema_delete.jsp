<%@page import="my.manager.cinema.CinemaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	CinemaDao cdao = CinemaDao.getInstance();	

	String message = null, url = null;
	int cnt = cdao.deleteCinama(request.getParameter("cno"));
	
	if(cnt != -1){
		message = "극장 삭제 성공";
	}
	else{
		message = "극장 삭제 실패";
	}
	url = "cinema_list.jsp";
	
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>';
</script>
