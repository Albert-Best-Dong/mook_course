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
    <div>
        <div align="left">
            <div style="display: inline">显示</div>
            <div style="display: inline">
                <select>
                    <option value="3">5</option>
                    <option value="4">4</option>
                    <option value="5">3</option>
                </select>
            </div>
            <div style="display: inline">条</div>
        </div>

        <div align="right">
            <form id="searchForm" method="post" action="mook_course/GetCourseServlet" >
                <div style="display: inline">搜索：</div>
                <div class="search" style="display: inline">
                    <input type="hidden" name="page" value="1">
                    <input type="text" name="title" class="search_input" value="${title}">

                </div>
            </form>
        </div>
    </div>
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

    </table>
    <div align="right">


        <form method="post" action="mook_course/GetCourseServlet" style="display: inline">
            <input type="hidden" name="page" value="1">
            <input type="hidden" name="title" value="${title}">
            <input type="submit" value="首页" class="btn">
        </form>
        <form method="post" action="mook_course/GetCourseServlet" style="display: inline">
            <input type="hidden" name="page" value="${prePage}">
            <input type="hidden" name="title" value="${title}">
            <input type="submit" value="上一页" class="btn">
        </form>

        <form method="post" action="mook_course/GetCourseServlet" style="display: inline">
            <input type="hidden" name="page" value="${nextPage}">
            <input type="hidden" name="title" value="${title}">
            <input type="submit" value="下一页" class="btn">
        </form>
        <form method="post" action="mook_course/GetCourseServlet" style="display: inline">
            <input type="hidden" name="page" value="${totalPage}">
            <input type="hidden" name="title" value="${title}">
            <input type="submit" value="尾页" class="btn">
        </form>
        第${curPage}页/共${totalPage}页
    </div>
</center>
<script type="text/javascript">

</script>
</body>
</html>