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
<td align="center" style="font-size:24px; color:#666">费用编辑</td>
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
<s:form id="saveForm" action="fee_update" method="post" namespace="/" theme="simple">
	
	<table style="font-size::16px">
		<tr>
			<td>编号：</td>
		  <td><s:textfield value="%{model.fid}" name="fid"/></td>
		   <td>水费：</td>
		  <td><s:textfield value="%{model.wfee}" name="wfee"/></td>
		</tr>
		<tr>
		<td>电费：</td>
		  <td><s:textfield value="%{model.efee}" name="efee"/></td>
		  <td>物业费：</td>
		  <td><s:textfield value="%{model.tfee}" name="tfee"/></td>
		</tr>
	</table>
</s:form>
</body>
</html> 