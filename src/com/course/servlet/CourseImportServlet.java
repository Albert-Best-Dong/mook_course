package com.course.servlet;

import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.service.CourseService;
import com.course.service.serviceimpl.CourseServiceImpl;

import com.course.utils.ExcelRead;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/CourseImportServlet")
public class CourseImportServlet extends HttpServlet {
    CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ArrayList<String>> courseList = ExcelRead.readFile(request);
        cs.importCourse(courseList);
        request.setAttribute("courses", CourseDaoImpl.getCourseTable());
        request.getRequestDispatcher("/GetCourseServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
