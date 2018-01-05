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
<td align="center" style="font-size:24px; color:#666">用水量录入</td>
</tr>
<tr>
<td align="right" > <a href="${pageContext.request.contextPath}/water_saveUI.action">添加</a></td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
   <tr>
    	<th width="200">编号</th>
    	<th  width="200">房号</th>
    	<th  width="200">年份</th>
    	<th  width="200">月份</th>
    	<th  width="200">用水量(吨)</th>
   		<th  width="200">编辑</th>
   		<th  width="200">删除</th>
   </tr>
</thead>
<tbody>
<s:iterator value="list" var="w">
	<tr>
		<td align="center"><s:property value="#w.wid"/></td>
		<td align="center"><s:property value="#w.houses.hname"/></td>
		<td align="center"><s:property value="#w.wyear"/></td>
		<td align="center"><s:property value="#w.wmonth"/></td>
		<td align="center"><s:property value="#w.wquan"/></td>
		<td align="center"><a href="${pageContext.request.contextPath}/water_edit.action?wid=<s:property value="#w.wid"/>"><img src="<%=basePath %>images/edit.gif"/></a></td>
		<td align="center"><a href="${pageContext.request.contextPath}/water_delete.action?wid=<s:property value="#w.wid"/>"><img src="<%=basePath %>images/trash.gif"/></a></td>
	</tr>
</s:iterator>
</tbody>
</table>
<br/>


<table border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td align="right">
   <span>第<s:property value="currPage"/>页&nbsp;&nbsp;总共<s:property value="totalPage"/>页</span>&nbsp;&nbsp;
   <span>总记录数：<s:property value="totalCount"/>&nbsp;&nbsp;每页显示:<s:property value="pageSize"/></span>&nbsp;&nbsp;
   <span>
   <s:if test="currPage != 1">
       <a href="${pageContext.request.contextPath }/water_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
       <a href="${pageContext.request.contextPath }/water_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
   </s:if>
   <s:if test="currPage != totalPage">
       <a href="${pageContext.request.contextPath }/water_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
       <a href="${pageContext.request.contextPath }/water_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
   </s:if>
   </span>
</td>
</tr>
</table>
</body>
</html>
