package com.course.servlet;

import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
*
*   @author albert
*   @date 2019/4/20
*   
*/
@WebServlet("/GetCourseServlet")
public class GetCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("courses", CourseDaoImpl.getCourseTable());
        request.getRequestDispatcher("/showCourse.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
