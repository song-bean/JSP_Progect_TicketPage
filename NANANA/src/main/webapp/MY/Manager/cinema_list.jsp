<%@page import="my.manager.cinema.CinemaBean"%>
<%@page import="my.manager.cinema.CinemaDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="my.manager.movie.MovieBean"%>
<%@page import="my.manager.movie.MovieDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<title>극장 목록 페이지</title>

<%
	CinemaDao cdao = CinemaDao.getInstance();
	ArrayList<CinemaBean> clist = cdao.getAllCinema();
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
				<td>NANANA 극장</td>
				<td>좌석 수</td>
				<td>주소</td>
				<td>전화번호</td>
				<td>수정</td>
				<td>삭제</td>
			</tr>
	<%
		if(clist.size() == 0){
	%>
			<tr>
				<td colspan="7">등록된 극장이 없습니다.</td>
			</tr>
	<%		
		}
		for( CinemaBean cb : clist){
	%>
			<tr>
				<td><%= cb.getCno() %></td>
				<td><%= cb.getCname() %></td>
				<td><%= cb.getSeat() %></td>
				<td><%= cb.getAddress() %></td>
				<td><%= cb.getTel1() %>-<%= cb.getTel2() %></td>
				<td><a class="update_a" href="cinema_update.jsp?cno=<%= cb.getCno() %>">수정</a></td>
				<td><a class="delete_a" href="cinema_delete.jsp?cno=<%= cb.getCno() %>">삭제</a></td>
	<%	
		}
	%>
			</tr>
		</table>
		<br>
	</td>
<%@ include file="manager_bottom.jsp" %>