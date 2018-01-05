<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<frameset rows="80,*">
   <frame name="top" src="<%=basePath %>top.jsp">
   <frameset cols="100%,*" id="main">
     <frame name="center" src="<%=basePath %>test.html">
   </frameset>
</frameset>