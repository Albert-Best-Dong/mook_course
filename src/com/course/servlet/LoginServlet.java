package com.course.servlet;

import com.course.service.CourseService;
import com.course.service.serviceimpl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
*   登录的Servlet
*   @author albert
*   @date 2019/4/20
*
*/
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //账号密码正确
        if(cs.login(username, password)!= 0){
            request.getSession().setAttribute("loginUser",username);
            //是否为超级管理员
            if(cs.login(username, password)== 1){
                request.getSession().setAttribute("flag",1);
            }
            response.sendRedirect(request.getContextPath()+"/pages/admin/server.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
