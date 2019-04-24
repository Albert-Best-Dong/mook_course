package com.course.servlet;

import com.course.dao.daoimpl.CourseDaoImpl;

import com.course.utils.PageUtil;

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

//        request.setAttribute("courses", CourseDaoImpl.getCourseTable());
//        request.getRequestDispatcher("/showCourse.jsp").forward(request,response);
        String name = request.getParameter("title");

        String pageStr = request.getParameter("page");
        int page = 1;
        if (null != pageStr && !"".equals(pageStr)) {
            page = Integer.parseInt(pageStr);
        }

        int totalProducts = CourseDaoImpl.getCourseTable().size();
        int totalPage = totalProducts % 5 > 0 ? totalProducts / 5 + 1 : totalProducts / 5;

        request.setAttribute("curPage", page);
        request.setAttribute("prePage", page > 1 ? page - 1 : 1);
        request.setAttribute("nextPage", totalPage > page ? page + 1 : totalPage);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("title", name);


        request.setAttribute("courses", PageUtil.getCourses(page, 5, name));
        request.getRequestDispatcher("/showCourse.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
