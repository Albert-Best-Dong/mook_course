<%@ page import="java.util.List" %>
<%@ page import="com.course.dao.daoimpl.CourseDaoImpl" %>
<%@ page import="java.util.Map" %>
<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <base href="/mook_course">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>管理员查询</title>
</head>
<body>
<center>
    <h1>管理员查询</h1>
    <hr>
    <table cellspacing="0px" cellpadding="0px" border="1px" width="600px">
        <thead>
        <tr>
            <th>用户名</th>
            <th>密码</th>
            <th>类型</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Map<String, Object> user : CourseDaoImpl.getUserTable()) {

        %>
        <tr>
            <td><%=user.get("username")%></td>
            <td><%=user.get("password")%></td>
            <td>
                <%=user.get("userType")%>
            </td>
            <td><a href="/mook_course/deluser?username=<%=user.get("username")%>">删除</a></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</center>
</body>
</html>