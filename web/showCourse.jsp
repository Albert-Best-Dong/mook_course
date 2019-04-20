<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@include file="include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>课程查询</title>
<!-- 分页查看 -->
<link rel="stylesheet" type="text/css" href="resources/js/dataTable/jquery.dataTables.min.css">
<script type="text/javascript" src="resources/js/dataTable/jquery.js"></script>
<script type="text/javascript" src="resources/js/dataTable/jquery.dataTables.min.js"></script>
</head>
<body>
	<center>
		<h1>课程查询</h1>
		<hr>
		<table cellspacing="0px" cellpadding="0px" border="1px" width="100%" class="tablelist" id="example">
			<thead>
				<tr>
					<th>课程ID</th>
					<th>课程名</th>
					<th>方向</th>
					<th>描述</th>
					<th>时长(小时)</th>
					<th>操作人</th>
				</tr>
			</thead>
			<tbody>
			
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				
			</tbody>
		</table>
	</center>
	
</body>
</html>