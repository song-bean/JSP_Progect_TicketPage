<%@page import="my.user.ticket.ticketBean"%>
<%@page import="my.user.ticket.ticketDao"%>
<%@page import="my.manager.movie.MovieBean"%>
<%@page import="my.manager.movie.MovieDao"%>
<%@page import="my.manager.cinema.CinemaBean"%>
<%@page import="my.manager.cinema.CinemaDao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String sid = (String)session.getAttribute("sid");
	String tmovie = request.getParameter("tmovie");
	String tcinema = request.getParameter("tcinema");
	String time = request.getParameter("time");
	
	String seat_pos = "";
	String[] seat_pos1 = request.getParameterValues("seat_pos");
	for(int i=0;i<seat_pos1.length;i++){
		seat_pos += seat_pos1[i] + " ";
	}
	int seat_cap = seat_pos1.length;
	int adult = Integer.parseInt(request.getParameter("adult"));
	int child = Integer.parseInt(request.getParameter("child"));
	String pay = request.getParameter("pay");
	
	ticketDao tdao = ticketDao.getInstance();
	
	ticketBean tb = new ticketBean();
	tb.setTmovie(tmovie);
	tb.setTcinema(tcinema);
	tb.setTime(time);
	tb.setTid(sid);
	tb.setSeat_pos(seat_pos);
	tb.setSeat_cap(seat_cap);
	tb.setAdult(adult);
	tb.setChild(child);
	tb.setPay(pay);
	
	String message, url;
	int cnt = tdao.insertTicket(tb); 
	if(cnt == 1){
		message = "예매되었습니다.";
		url = request.getContextPath() + "/MY/Home/Ticket/home_ticket_list.jsp";
	}
	else{
		message = "결제 금액이 부족합니다.";
		url = request.getContextPath() + "/MY/Home/home.jsp";
	}	
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>'; 
</script>