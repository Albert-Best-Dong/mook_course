package com.course.service.serviceimpl;

import com.course.dao.CourseDao;
import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;
import com.course.service.CourseService;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
*   课程Service实现类
*   @author albert
*   @date 2019/4/20
*
*/
public class CourseServiceImpl implements CourseService {
    private CourseDao cd = new CourseDaoImpl();     //CourseDao对象，用于调用方法的返回值
    @Override
    public int login(String username, String password) {
        return 0;
    }

    @Override
    public void addUser(String username, String password) {

    }

    @Override
    public List<Map<String, Object>> getAllUsers() {
        return null;
    }

    @Override
    public void delUser(String username) {

    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public List<Course> getAllCourse() {
        return null;
    }

    @Override
    public void importCourse(ArrayList<ArrayList<String>> courseList) {

    }

    @Override
    public void exportCourse(HttpServletResponse response) {

    }
}
