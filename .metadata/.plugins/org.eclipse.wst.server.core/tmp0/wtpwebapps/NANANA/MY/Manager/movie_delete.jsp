<%@page import="java.io.File"%>
<%@page import="my.manager.movie.MovieDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MovieDao mdao = MovieDao.getInstance();

	int mno = Integer.parseInt(request.getParameter("mno"));
	String poster = request.getParameter("poster");
	
	String configFolder = config.getServletContext().getRealPath("/poster/");
	File delFile = null;
	
	if(poster != null){
		delFile = new File(configFolder,poster);
		
		if(delFile.exists()){
			if(delFile.delete()){
				System.out.println("포스터 삭제 완료");
			}
		}
	}
	
	String message = null, url = null;
	int cnt = mdao.deleteMovie(mno);
	
	if(cnt != -1){
		message = "영화 삭제 성공";
	}
	else{
		message = "영화 삭제 실패";
	}
	url = "movie_list.jsp";
	
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>';
</script>
