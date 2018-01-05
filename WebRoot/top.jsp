<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	<div class="easyui-navpanel">
		<header>
			<div class="m-toolbar">
				<div class="m-title">
					<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,outline:true" style="width:70px">Home</a>  
					<a href="javascript:void(0)" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon-edit',outline:true" style="width:70px">Edit</a>  
					<a href="javascript:void(0)" class="easyui-menubutton" data-options="menu:'#mm2',iconCls:'icon-help',outline:true" style="width:75px">Help</a>  
					<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true,outline:true" style="width:70px">About</a>  
				</div>
			</div>
		</header>
	</div>
	<div id="mm1" class="easyui-menu" style="width:150px;">
		<div data-options="iconCls:'icon-undo'">Undo</div>
		<div data-options="iconCls:'icon-redo'">Redo</div>
		<div class="menu-sep"></div>
		<div>Cut</div>
		<div>Copy</div>
		<div>Paste</div>
		<div class="menu-sep"></div>
		<div>Toolbar</div>
		<div data-options="iconCls:'icon-remove'">Delete</div>
		<div>Select All</div>
	</div>
    <div id="mm2" style="width:100px;">  
        <div>Help</div>  
        <div>Update</div>  
        <div>About</div>  
    </div>  
</body>
</html>