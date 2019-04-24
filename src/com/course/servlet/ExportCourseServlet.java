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
*
*   @author albert
*   @date 2019/4/20
*   @param  
*   @return 
*/
@WebServlet("/exportcourse")
public class ExportCourseServlet extends HttpServlet {
    CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            cs.exportCourse(response);
        } catch (Exception e) {
            response.getWriter().print("不存在");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
