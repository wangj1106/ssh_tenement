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
<td align="center" style="font-size:24px; color:#666">用水量修改</td>
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
<s:form id="saveForm" action="water_update" method="post" namespace="/" theme="simple">
	
	<table style="font-size::16px">
		<tr>
		  <td>编号：</td>
		  <td><s:textfield value="%{model.wid}" name="wid"/></td>
		   <td>房号：</td>
		  <td><s:select name="houses.hid" headerKey="" value="%{model.houses.hid}" headerValue="--请选择--" list="list" listKey="hid" listValue="hname"/></td>
		</tr>
		<tr>
		  <td>年份：</td>
		  <td><s:textfield value="%{model.wyear}" name="wyear"/></td>
		  <td>月份：</td>
		  <td><s:textfield value="%{model.wmonth}" name="wmonth"/></td>
		</tr>
		<tr>
		  <td>用水量(吨)：</td>
		  <td><s:textfield value="%{model.wquan}" name="wquan"/></td>
		</tr>
	</table>
</s:form>
</body>
</html> 