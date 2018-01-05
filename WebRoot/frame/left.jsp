<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<link href="dtree.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="dtree.js"></script>
</head>

<body bgColor=#ADADAD leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table width="90%" border="0" cellspacing="1" cellpadding="2" align="center">
<div class="dtree">
  <script type="text/javascript">
    d=new dTree('d');
    d.add('01','-1','物业管理系统');
    d.add('0101','01','住宅管理');
    d.add('010101','0101','房产管理','${pageContext.request.contextPath}/houses_findAll.action','','right');
    d.add('010102','0101','户主管理','${pageContext.request.contextPath}/user_findAll.action','','right');
    
    d.add('0102','01','投诉报修管理');
    d.add('010201','0102','投诉管理','${pageContext.request.contextPath}/complaint_findAll.action','','right');
    d.add('010202','0102','报修管理','${pageContext.request.contextPath}/repair_findAll.action','','right');
    
    d.add('0103','01','费用管理');
    d.add('010301','0103','用水量录入','${pageContext.request.contextPath}/water_findAll.action','','right');
    d.add('010302','0103','用电量录入','${pageContext.request.contextPath}/electric_findAll.action','','right');
    d.add('010303','0103','费用录入','${pageContext.request.contextPath}/fee_findAll.action','','right');
    document.write(d);
  </script>
</div>
</table>

</body>
</html>
