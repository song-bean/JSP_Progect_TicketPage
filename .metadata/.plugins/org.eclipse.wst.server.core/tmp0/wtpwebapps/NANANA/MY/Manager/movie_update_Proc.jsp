<%@page import="java.io.File"%>
<%@page import="my.manager.movie.MovieDao"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String configFolder = config.getServletContext().getRealPath("/poster/");
	
	int maxSize = 1024*1024*5; 
	String encoding="UTF-8"; 
	MultipartRequest mr = new MultipartRequest(request,configFolder,maxSize,encoding,new DefaultFileRenamePolicy());
	
	MovieDao mdao = MovieDao.getInstance();
	
	String poster = "영화 포스터 없음";
	
	if(!mr.getParameter("pposter").equals("영화 포스터 없음")){
		File delFile = new File(configFolder, mr.getParameter("pposter"));
		if(mr.getFilesystemName("poster") != null){ //기존 포스터 o, 새 포스터 o => 기존 포스터 삭제하고 새 포스터 넣기 
			if(delFile.delete()){ 
				%>
					<script type="text/javascript">
						alert("기존 포스터 삭제 성공"); 
					</script>		
				<% 		
				poster = mr.getFilesystemName("poster");
			}
		}
		else{ //기존 포스터 o, 새 포스터 x => 기존 포스터 삭제  
			if(delFile.delete()){ 
				%>
					<script type="text/javascript">
						alert("기존 포스터 삭제 성공"); 
					</script>		
				<% 		
			}
		}
	}
	else{ 
		if(mr.getFilesystemName("poster") != null){ //기존 포스터 x, 새 포스터 o => 새 포스터 바로 넣기 
			poster = mr.getFilesystemName("poster");
		}
	}
	
	String message = null, url = null;
	int cnt = mdao.updateMovie(mr, poster); 
	if(cnt != -1){
		message = "영화 수정 성공";
		url = "movie_list.jsp";
	}
	else{
		message = "영화 수정 실패";
		url = "movie_list.jsp?mno=" + mr.getParameter("mno");
	}
	
%>

<script type="text/javascript">
	alert("<%= message %> "); 
	location.href= '<%= url %>';
</script>
