<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lily+Script+One&family=Roboto&family=Shadows+Into+Light&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link href="<%= request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
<link href="<%= request.getContextPath() %>/css/kfonts2.css" rel="stylesheet">
<link href="<%= request.getContextPath() %>/css/custom2.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="<%= request.getContextPath() %>/js/bootstrap.min.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

<style type="text/css">
	body{
		background-color: #353535;
		color : white;
	}
	a:hover{
		text-decoration: none;
	}
	.f1{
		font-family: 'Shadows Into Light', cursive;	
		font-size: 100px;
		color: #CEF279;
	}
	.f2{
		font-family: 'Nanum Brush Script', cursive;
		font-size: 22px;
	}
	#m1{
		color : white;
		background: #353535;
		font-size: 30px;
	}
	#m1:hover{
		background: #353535;
		color : #FAED7D;
	}
	#mm1{
		width: 100%;
		background: #353535;	
		text-align: center;
	}
	#mm1>li>a{
		color : white;
		font-family: 'Nanum Brush Script', cursive;
		font-size: 25px;
	}
	#mm1>li>a:hover{
		background: #353535;	
		color : FAED7D;
	}
	table{
		margin: auto;
	}	
	hr{
		border : 0.1px solid #4B4B4B ;
	}
	.f4{
		font-family: 'Gowun Dodum', sans-serif;
		color : #9F9F9F;
		font-size: 13px;
	}
	.bottom_table{
		color : #9F9F9F;
		width : 80%;
		height: 150px;
		margin: 20px 30px;
		text-align: center;
	}
</style>

<%
	String sid = (String)session.getAttribute("sid");
%>


<table border="0" width="1000"> 
	<tr>
		<td class="f1" valign="bottom" width="730">
			<a class="f1" href="<%= request.getContextPath() %>/MY/Home/home.jsp">
			MANAGER
			</a>
		</td>		
		<td width="170">
		</td>
		<td align="center" width="100">	
		<%
			if(sid != null){
		%>
				<a href="<%= request.getContextPath() %>/MY/Home/logout.jsp"><img src="<%= request.getContextPath() %>/icon/unlock.png" width="30"></a><br>
				<a class="f2" href="<%= request.getContextPath() %>/MY/Home/logout.jsp">
					<font color=black>관리자</font> <br>
					<font color=black>로그아웃</font> 
				</a>
		<%
			}
		%>	
		</td>
		
	</tr>
	
	<tr>
		<td colspan="4">
			<hr>
		</td>
	</tr>
	
	<tr>
		<td align="center" colspan="1" style="color : white">
    		 <ul class="nav nav-pills nav-justified"> 
		         <li class="dropdown">
		         	  <a data-toggle="dropdown" class="f2" href="#" id="m1">영화
		         	  	 <span class="caret"></span>
		         	  </a>
		         	   <ul class="dropdown-menu" role="menu" id="mm1"> 
			               <li><a role="menuitem" href="movieForm.jsp">영화 등록</a></li>
			               <li><a role="menuitem" href="movie_list.jsp">영화 목록</a></li>
			          </ul>
		         </li>
		         
		         <li class="dropdown">
		         	  <a data-toggle="dropdown" class="f2" href="#" id="m1">극장
		         	  	 <span class="caret"></span>
		         	  </a>
		         	   <ul class="dropdown-menu" role="menu" id="mm1"> 
			               <li><a role="menuitem" href="cinemaForm.jsp">극장 등록</a></li>
			               <li><a role="menuitem" href="cinema_list.jsp">극장 목록</a></li>
			          </ul>
		         </li>
		         
		         <li class="dropdown">
		         	  <a data-toggle="dropdown" class="f2" href="#" id="m1">회원
		         	  	 <span class="caret"></span>
		         	  </a>
		         	   <ul class="dropdown-menu" role="menu" id="mm1"> 
			               <li><a role="menuitem" href="user_list.jsp">회원 정보</a></li>
			               <li><a role="menuitem" href="manager_ticket_list.jsp">예매 내역</a></li>
			          </ul>
		         </li>
		          <li class="dropdown">
		         	  <a data-toggle="dropdown" class="f2" href="#"id="m1">스낵
		         	  <span class="caret"></span>
		         	  </a>
		         	   <ul class="dropdown-menu" role="menu" id="mm1"> 
			               <li><a role="menuitem" href="snackForm.jsp">스낵 등록</a></li>
			               <li><a role="menuitem" href="snack_list.jsp">스낵 목록</a></li>
			          </ul>
		         </li>
		     </ul>
		</td>
	</tr>
	
	<tr>
		
		
