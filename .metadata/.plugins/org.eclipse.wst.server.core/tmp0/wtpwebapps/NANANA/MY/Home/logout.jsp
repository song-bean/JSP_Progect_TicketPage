<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	session.invalidate();
%>

<script type="text/javascript">
	location.href="<%= request.getContextPath() %>/MY/Home/home.jsp";
</script>