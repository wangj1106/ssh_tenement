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
<td align="center" style="font-size:24px; color:#666">水费查询</td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th  width="200">房号</th>
    	<th  width="200">年份</th>
    	<th  width="200">月份</th>
    	<th  width="200">水费(元)</th>
   </tr>
</thead>
<tbody>
<s:iterator value="list" var="w">
	<tr>
	<s:if test="#w.houses.user.uid==#session.existUser.uid">
		<td align="center"><s:property value="#w.houses.hname"/></td>
		<td align="center"><s:property value="#w.wyear"/></td>
		<td align="center"><s:property value="#w.wmonth"/></td>
		<td align="center"><s:property value="#w.wquan*#session.existFee.wfee" /></td>
	</s:if>
	</tr>
</s:iterator>
</tbody>
</table>
<br/>
</body>
</html>
