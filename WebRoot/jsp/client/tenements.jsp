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
<td align="center" style="font-size:24px; color:#666"> 物业费查询</td>
</tr>

</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th width="200">房产名称</th>
    	<th  width="200">面积</th>
    	<th  width="200">物业费(元/月)</th>
   </tr>
</thead>
<tbody>
<s:iterator value="list" var="h">
	
	<tr>
	<s:if test="#h.user.uid==#session.existUser.uid">
		<td align="center"><s:property value="#h.hname"/></td>
		<td align="center"><s:property value="#h.harea"/></td>
		<td align="center"><s:property value="#h.harea*#session.existFee.tfee"/></td>
	</s:if>
	</tr>

</s:iterator>
</tbody>
</table>
<br/>


<table border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td align="right"></td>
</tr>
</table>
</body>
</html>
