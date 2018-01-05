<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
	<title>业主</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/reset.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/main.css">

	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/mobile.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/demo.css">
	
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.mobile.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
  </head>
  
  <body>
    <div class="headerBar">
	<div class="logoBar login_logo">
		<div class="comWidth">
			<h3 class="welcome_title">业主登录</h3>
		</div>
	</div>
</div>

		<div style="text-align:center;margin:50px 30px">
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,outline:true" style="width:80px;height:30px" onclick="$('#dlg1').dialog('open').dialog('center')">Login</a>
		</div>

		<div id="dlg1" class="easyui-dialog" style="padding:20px 6px;width:80%;" data-options="inline:true,modal:true,closed:true,title:'Login'">
			<form id="login" action="user_login" method="post">
			<div style="margin-bottom:10px">
				<input class="easyui-textbox" type="text" id="username" name="username" prompt="Username" style="width:100%;height:30px">
			</div>
			<div>
				<input class="easyui-textbox" type="password" type="text" id="password" name="password" prompt="Password" style="width:100%;height:30px">
			</div>
			
			<div class="dialog-button">
				<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100%;height:35px"  onclick="submitForm()">登录</a>
	        	<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100%;height:35px"  onclick="clearForm()">重置</a>
			</div>
			</form>
		</div>


<s:form action="user_login" method="post" namespace="/" theme="simple">



</s:form>
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

<div class="hr_25"></div>
  </body>
</html>

