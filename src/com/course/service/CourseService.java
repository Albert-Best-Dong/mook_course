package com.course.service;

import com.course.domian.Course;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
*   课程Service接口
*   @author albert
*   @date 2019/4/20
*
*/
public interface CourseService {
    public int login(String username, String password);//用户登录

    public void addUser(String username, String password);//普通管理员添加方法

    public List<Map<String, Object>> getAllUsers();//查询所有管理员

    public void delUser(String username);//删除管理员

    public void addCourse(Course course);//添加课程

    public List<Course> getAllCourse();//查询所有课程信息

    public void importCourse(ArrayList<ArrayList<String>> courseList);

    public void exportCourse(HttpServletResponse response);
}
