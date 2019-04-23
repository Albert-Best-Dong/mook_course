package com.course.utils;

import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;
import com.course.service.CourseService;
import com.course.service.serviceimpl.CourseServiceImpl;

import javax.servlet.http.HttpServletRequest;


public class CourseUtil {
    static CourseService cs = new CourseServiceImpl();
    //添加
    public static void addCourse(HttpServletRequest request){
        String courseId = request.getParameter("courseId");
        String courseName = request.getParameter("courseName");
        String courseType = request.getParameter("courseType");
        String description = request.getParameter("description");
        String courseTime = request.getParameter("courseTime");
        String operator = request.getParameter("operator");
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setCourseType(courseType);
        course.setDescription(description);
        course.setCourseTime(courseTime);
        course.setOperator(operator);
        cs.addCourse(course);
        System.out.println(course);
        request.setAttribute("courses", CourseDaoImpl.getCourseTable());

    }
}
