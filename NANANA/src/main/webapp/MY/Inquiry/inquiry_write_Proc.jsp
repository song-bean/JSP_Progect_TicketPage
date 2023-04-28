<%@page import="java.sql.Timestamp"%>
<%@page import="my.user.inquiry.inquiryDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String iid = request.getParameter("iid");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	int passwd = Integer.parseInt(request.getParameter("passwd"));
	
	Timestamp reg_date = new Timestamp(System.currentTimeMillis());
	
	inquiryDao idao = inquiryDao.getInstance();
	int cnt = idao.insertInquiry(iid,subject,content,passwd,reg_date);  
	
	String message = null;
	String url = null;
	if(cnt > 0){
		message = "작성 되었습니다."; 
		url = request.getContextPath() + "/MY/Inquiry/inquiry.jsp";
	}
	else{
		message = "작성 되지 못하였습니다.";
		url = request.getContextPath() + "/MY/Inquiry/inquiry_write.jsp";
	}
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>'; 
</script>