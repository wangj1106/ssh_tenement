<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head></head>
<body>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666">用电量添加</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回 </a>
</td>
</tr>
</table>
<br/>
<br/>
<!-- action对应一个action标签，id对应提交时的对应关系 -->
<s:form id="saveForm" action="electric_save" method="post" namespace="/" theme="simple">
	<table style="font-size::16px">
		<tr>
		  <td>编号：</td>
		  <td><s:textfield name="eid"/></td>
		  <td>房号：</td>
		  <td><s:select name="houses.hid" headerKey="" headerValue="--请选择--" list="list" listKey="hid" listValue="hname"/></td>
		</tr>
		
		<tr>
		  <td>年份：</td>
		  <td><s:textfield name="eyear"/></td>
		  <td>月份：</td>
		  <td><s:textfield name="emonth"/></td>
		</tr>
		
		<tr>
		  <td>用电量(千瓦时)：</td>
		  <td><s:textfield name="equan"/></td>
		</tr>
	</table>
</s:form>
</body>
</html> 