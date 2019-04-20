<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@include file="include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>课程添加</title>
</head>
<body>
<center>
    <h1>课程添加</h1>
    <hr>
    <form action="<%=basePath%>/AddCourseServlet" method="post" onsubmit="return validateCode()">
        <table width="400px" cellspacing="0px" cellpadding="0px" border="1px">
            <tr>
                <td>课程ID</td>
                <td><input type="text" name="courseId"></td>
            </tr>
            <tr>
                <td>课程名</td>
                <td><input type="text" name="courseName"></td>
            </tr>
            <tr>
                <td>方向</td>
                <td>
                    <select name="courseType">
                        <option value="Java">Java</option>
                        <option value="前端">前端</option>
                        <option value="Linux">Linux</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>描述</td>
                <td>
                    <textarea name="description"></textarea>
                </td>
            </tr>
            <tr>
                <td>时长</td>
                <td>
                    <input name="courseTime" type="text">
                </td>
            </tr>
            <tr>
                <td>操作人</td>
                <td>
                    <input name="operator" type="text" value=" readonly=" readonly">
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center">
                    <input type="submit" value="添加">
                    <input type="reset" value="取消">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>