package com.course.dao.daoimpl;

import com.course.dao.CourseDao;
import com.course.domian.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseDaoImpl implements CourseDao {
    private static final List<Map<String,Object>> userTable = new ArrayList<Map<String, Object>>();    //用户表
    private static final List<Course> courseTable = new ArrayList<Course>();      //课程表

    static {
        Map<String,Object> imooc =new HashMap<String,Object>();
        imooc.put("username","imooc");
        imooc.put("password", "imooc");
        imooc.put("userType", "超级管理员");
        userTable.add(imooc);
    }
    public static List<Map<String, Object>> getUserTable() {
        return userTable;
    }

    public static List<Course> getCourseTable() {
        return courseTable;
    }

    @Override
    public int login(String username, String password) {
        int flag = 0;
        for(Map<String,Object> userMap : CourseDaoImpl.getUserTable()){
            if (userMap.get("username").equals(username)){
                if(userMap.get("password").equals(password)){
                    if(userMap.get("userType").equals("超级管理员")){
                        flag = 1;
                    }else{
                        flag = 2;
                    }
                }
            }
        }
        return flag;
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
}
