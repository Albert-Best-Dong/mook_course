<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<base href="/mook_course">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>课程查询</title>
<!-- 分页查看 -->
<link rel="stylesheet" type="text/css" href="mook_course/resources/js/dataTable/jquery.dataTables.min.css">
<script type="text/javascript" src="mook_course/resources/js/dataTable/jquery-3.3.1.js"></script>
<script type="text/javascript" src="mook_course/resources/js/dataTable/jquery.dataTables.min.js"></script>
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
				<c:forEach items="${courses}" var="course">
					<tr>
						<td>${course.courseId}</td>
						<td>${course.courseName}</td>
						<td>${course.courseType}</td>
						<td>${course.description}</td>
						<td>${course.courseTime}</td>
						<td>${course.operator}</td>
					</tr>
				</c:forEach>
			</tbody>
            第${curPage}页/共${totalPage}页
            <div align="right">
                <a href="#">首页</a>
                <a href="#">上一页</a>
                <a href="#">下一页</a>
                <a href="#">尾页</a>
            </div>
		</table>
	</center>
	<script type="text/javascript">

	</script>
</body>
</html>