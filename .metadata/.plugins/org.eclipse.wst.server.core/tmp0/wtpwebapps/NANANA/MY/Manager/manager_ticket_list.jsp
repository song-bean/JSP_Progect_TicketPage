<%@page import="my.user.ticket.ticketBean"%>
<%@page import="my.user.ticket.ticketDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="my.manager.movie.MovieBean"%>
<%@page import="my.manager.movie.MovieDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<title>관리자 예매 내역 페이지</title>

<%
	ticketDao tdao = ticketDao.getInstance();
	ArrayList<ticketBean> tlist = tdao.getAllTicket(); 
 
%>

<style type="text/css">
	.mtable{
		text-align: center;
		font-family: 'Nanum Pen Script', cursive;
		width : 95%;
	}
	.mtable td{
		border-bottom: 0.3px dotted white;
	}
	.mtable td:firth-child{
		border-top: 0.3px dotted white;
	}
	.mtable td a{
		color : #E4F7BA;
	}
	.mtable td .update_a:hover{
		color : #6799FF;
	}
	.mtable td .delete_a:hover{
		color : #CC3D3D;
	}

</style>

<%@ include file="manager_top.jsp" %>
	<td colspan="3">
		<br>
		<table class="mtable">
			<tr>
				<td height="50">번호</td>
				<td>회원명(회원 아이디)</td>
				<td>영화 제목</td>
				<td>극장</td>
				<td>좌석</td>
				<td>상영 시간</td>
				<td>결제 방법</td>
			</tr>
	<%
		if(tlist.size() == 0){
	%>
			<tr>
				<td colspan="12">등록된 회원이 없습니다.</td>
			</tr>
	<%		
		}
		for(int i=0;i<tlist.size();i++){
	%>
			<tr>
				<td><%= tlist.get(i).getTno() %></td>
				<td><%= tlist.get(i).getUname() %>(<%= tlist.get(i).getTid() %>)</td>
				<td><%= tlist.get(i).getTmovie() %></td>
				<td><%= tlist.get(i).getTcinema() %></td>
				<td><%= tlist.get(i).getSeat_pos() %>(성인 : <%= tlist.get(i).getAdult() %> , 어린이 : <%= tlist.get(i).getChild() %> )</td>
				<td><%= tlist.get(i).getTime() %></td>
				<td><%= tlist.get(i).getPay() %></td>
	<%	
		}
	%>
			</tr>
		</table>
		<br>
	</td>
<%@ include file="manager_bottom.jsp" %>