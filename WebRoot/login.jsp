<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
	<title>管理员</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/reset.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/main.css">
	
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/demo.css">
	
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
	
  </head>
  
  <body>
<div id="mainwindow" class="easyui-window" 
style="width:500px;height:250px;background:#fafafa;overflow:hidden"
data-options="title:'管理员登录',draggable:true,maximizable:true,minimizable:false
,resizable:true,closable:true,border:true,collapsible:true,shadow:true">
<form id="login" action="admin_login" method="post">
	<div style="padding-left:150px">
		<div class="header" style="height:35px;">
			<div class="toptitle" style="margin-top: 25px; font-size:20px; ">物业管理系统</div>
		</div>
		
		<table cellpadding="0" cellspacing="3">
			<tr>
				<td>帐号：</td>
				<td><input class="easyui-textbox" id="username" name="username" style="width:114px;"></input></td>
			</tr>
			<tr>
	  			<td>密码：</td>
	  			<td><input class="easyui-textbox" id="password" name="password" type="password" style="width:114px;"></input></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">登录</a>
	        		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
				</td>
			</tr>
		</table>

	</div>
	</form>
</div>
	<script type="text/javascript">
	
		function submitForm(){
			var USERNAME = $("#username").val();
			var PASSWORD = $("#password").val();
			if(JUDGE.isNull(USERNAME) || JUDGE.isNull(PASSWORD)){
				$.messager.alert("提示消息", "用户名、密码都不能为空!", "info");
				return;
			}
			
			
			
			$('#login').submit();
		}
		
		function clearForm(){
			$('#login').form('clear');
		}
	</script>
  </body>
</html>
