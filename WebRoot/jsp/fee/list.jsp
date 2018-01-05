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
<td align="center" style="font-size:24px; color:#666">费用管理</td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th  width="200">水费(元/吨)</th>
    	<th  width="200">电费(元/千瓦时)</th>
    	<th  width="200">物业费(元/平方米*月)</th>
   		<th  width="200">编辑</th>
   </tr>
</thead>
<tbody>
<s:iterator value="list" var="f">
	<tr>
		<td align="center"><s:property value="#f.wfee"/></td>
		<td align="center"><s:property value="#f.efee"/></td>
		<td align="center"><s:property value="#f.tfee"/></td>
		<td align="center"><a href="${pageContext.request.contextPath}/fee_edit.action?fid=<s:property value="#f.fid"/>"><img src="<%=basePath %>images/edit.gif"/></a></td>
	</tr>
</s:iterator>
</tbody>
</table>
<br/>

</body>
</html>
