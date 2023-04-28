<%@page import="my.user.ticket.ticketDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	ticketDao tdao = ticketDao.getInstance();
	String message = null, url = null;

	int cnt = tdao.deleteTicket(request.getParameter("tno")); 
		
	if(cnt != -1){
		message = "예매가 취소되었습니다.";
	}
	else{
		message = "예매 취소 불가합니다.";
	}
	url = request.getContextPath() + "/MY/Home/Ticket/home_ticket_list.jsp";
		
%>		

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>';
</script>