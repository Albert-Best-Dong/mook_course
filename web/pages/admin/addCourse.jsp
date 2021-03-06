<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <base href="/mook_course">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>课程添加</title>
    <script type="text/javascript" src="mook_course/resources/js/dataTable/jquery-3.3.1.js"></script>
</head>
<body>
<center>
    <h1>课程添加</h1>
    <hr>
    <form action="mook_course/addcourse" method="post" onsubmit="return validateCode()">
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
                    <input name="operator" type="text" value="${loginUser}" readonly=" readonly">
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
<script type="text/javascript">
<%--    判断字符是否为空--%>
    function isEmpty(str) {
        var flag = false;
        if (str.length == 0 || str.match(/^\s*$/) || str == null) {
            flag =  true;
        }
        return flag;
    }
</script>
<script type="text/javascript">


    function validateCode() {
        var courseId = $("input[name='courseId']").val();
        var courseName = $("input[name='courseName']").val();
        var description = $("textarea[name='description']").val();
        var courseTime = $("input[name='courseTime']").val();

        if(isEmpty(courseId)||isEmpty(courseName)||isEmpty(description)||isEmpty(courseTime)){
            alert("信息有误");
            return false;
        }
    }
</script>
</body>
</html>