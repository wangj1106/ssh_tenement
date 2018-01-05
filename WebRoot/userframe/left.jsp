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
<table width="70%" border="0" cellspacing="1" cellpadding="2" align="center">
<div class="dtree">
  <script type="text/javascript">
    d=new dTree('d');
    d.add('01','-1','XX小区物业');
    d.add('0101','01','我的住宅');
    d.add('010101','0101','我的房产','${pageContext.request.contextPath}/houses_findHousesByUid.action','','right');
    d.add('010102','0101','我的信息','${pageContext.request.contextPath}/user_findSelf.action','','right');
    
    d.add('0102','01','我的投诉报修');
    d.add('010201','0102','我的投诉','${pageContext.request.contextPath}/complaint_findComplaintByUid.action','','right');
    d.add('010202','0102','我的报修','${pageContext.request.contextPath}/repair_findRepairByUid.action','','right');
    
    d.add('0103','01','我的费用');
    d.add('010301','0103','我的水费','${pageContext.request.contextPath}/water_findWaterByUid.action','','right');
    d.add('010302','0103','我的电费','${pageContext.request.contextPath}/electric_findElectricByUid.action','','right');
    d.add('010303','0103','我的物业费','${pageContext.request.contextPath}/houses_findTenementsFee.action','','right');
    document.write(d);
  </script>
</div>
</table>

</body>
</html>
