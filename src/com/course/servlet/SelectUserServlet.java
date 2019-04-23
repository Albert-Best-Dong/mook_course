package com.course.servlet;

import com.alibaba.fastjson.JSON;
import com.course.service.CourseService;
import com.course.service.serviceimpl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 查询用户的Servlet
 */

public class SelectUserServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(Objects.equals(request.getServletPath(),"/selectuser")){
            //查询用户信息
            List<Map<String, Object>> userList = cs.getAllUsers();
            PrintWriter out = response.getWriter();
            request.setAttribute("users",userList);
            response.sendRedirect(request.getContextPath()+"/selectUsers.jsp");
//        out.print(JSON.toJSONString(userList));
            out.flush();
            out.close();
        } else if (Objects.equals(request.getServletPath(), "/deluser")) {
            //删除用户
            cs.delUser(request.getParameter("username"));
            response.sendRedirect(request.getContextPath()+"/selectUsers.jsp");

        }

    }


}
