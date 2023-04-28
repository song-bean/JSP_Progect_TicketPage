<%@page import="my.user.userDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	userDao udao = userDao.getInstance();
	
	String id = request.getParameter("id");
	String uname = request.getParameter("uname");
	int birth = Integer.parseInt(request.getParameter("birth"));
	
	String message = null;
	String url = null;
	String password = udao.findPw(id, uname, birth);  
	if(password != null){
%>
		<script type="text/javascript">
			location.href = '<%= request.getContextPath() %>/MY/Home/updatePw.jsp?id=<%= id %>'; 
		</script>
<%		
	}
	else{
%>
		<script type="text/javascript">
			alert('해당 아이디가 없습니다.');
			var join = confirm('아이디 찾기 하시겠습니까?');
			
			if(join){
				location.href = '<%= request.getContextPath() %>/MY/Home/findid_Form.jsp'; 
			}
			else{
				location.href = '<%= request.getContextPath() %>/MY/Home/home.jsp'; 
			}
		</script>
<%		
	}
%> 

  