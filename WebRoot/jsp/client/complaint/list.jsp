<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
<td align="center" style="font-size:24px; color:#666">我的投诉</td>
</tr>
<tr>
<td align="right" > <a href="${pageContext.request.contextPath}/complaint_saveUI.action">添加</a></td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th  width="200">名称</th>
    	<th  width="200">内容</th>
   		<th  width="200">编辑</th>
   		<th  width="200">删除</th>
   </tr>
</thead>
<tbody>
<s:iterator value="list" var="c">
	
	<tr>
	<s:if test="#c.user.uid==#session.existUser.uid">
		<td align="center"><s:property value="#c.ctitle"/></td>
		<td align="center"><s:property value="#c.cdesc"/></td>
		<td align="center"><a href="${pageContext.request.contextPath}/complaint_edit.action?cid=<s:property value="#c.cid"/>"><img src="<%=basePath %>images/edit.gif"/></a></td>
		<td align="center"><a href="${pageContext.request.contextPath}/complaint_deleteByUser.action?cid=<s:property value="#c.cid"/>"><img src="<%=basePath %>images/trash.gif"/></a></td>
	</s:if>
	</tr>

</s:iterator>
</tbody>
</table>
<br/>

</body>
</html>
