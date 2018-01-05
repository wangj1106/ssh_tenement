<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<style type="text/css">
        .table1{
            border:1px solid #ddd;
            width:900px;
            
        }
        thead{
            background-color:lightblue;
        }

    </style>
</head>
<body>
<table border="0" width="900px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 个人信息查询</td>
</tr>

</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th width="200">户主姓名</th>
   		<th  width="200">编辑</th>
   </tr>
</thead>
<tbody>
	<tr>
		<td align="center"><s:property value="#session.existUser.uname"/></td>
		<td align="center"><a href="${pageContext.request.contextPath}/user_editSelf.action?uid=<s:property value="#session.existUser.uid"/>"><img src="<%=basePath %>images/edit.gif"/></a></td>
	</tr>
</tbody>
</table>
<br/>

</body>
</html>