﻿<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<style type="text/css">
.div1{ margin-top:50px; margin-left:300px; font-size:14px; color:white}
</style>
</head>

<body bgcolor="#00AEAE">
<div class="div1">
欢迎您：<s:property value="#session.existUser.uname"/>
</div>
</body>
</html>
