package com.course.servlet;

import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;
import com.course.service.CourseService;
import com.course.service.serviceimpl.CourseServiceImpl;
import com.course.utils.CourseUtil;

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
@WebServlet("/addcourse")
public class AddCourseServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CourseUtil.addCourse(request);
        request.getRequestDispatcher("/GetCourseServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
