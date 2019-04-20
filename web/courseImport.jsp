<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@include file="include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>课程批量导入</title>
</head>
<body>
<center>
    <h1>课程批量导入</h1>
    <hr>
    <form action="<%=basePath%>/CourseImportServlet" method="post" enctype="multipart/form-data">
        <table cellspacing="0px" cellpadding="0px" border="1px" width="400px">
            <tr>
                <td>Excel文件</td>
                <td><input type="file" name="file1"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center">
                    <input type="submit" value="导入">
                    <input type="reset" value="取消">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>