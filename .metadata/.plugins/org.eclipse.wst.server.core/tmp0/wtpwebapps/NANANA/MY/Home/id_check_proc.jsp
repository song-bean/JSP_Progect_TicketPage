<%@page import="my.user.userDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String userid = request.getParameter("userid");
	
	userDao udao = userDao.getInstance();
	boolean result = udao.searchId(userid); 
		
	if(result){
		out.print("NO");
	} else{
		out.print("YES");
	}
	
%>