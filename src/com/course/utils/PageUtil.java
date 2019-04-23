package com.course.utils;

import com.course.dao.daoimpl.CourseDaoImpl;
import com.course.domian.Course;

import java.util.ArrayList;
import java.util.List;

public final class PageUtil {

    public static List<Course> getCourses(int page, int size, String name) {
       final List<Course> courses = new ArrayList<>();

        if (null != name && !"".equals(name)) {
//            productMap.values().forEach(product -> {
//                if (product.getName().contains(name)) {
//                    courses.add(product);
//                }
//            });
            CourseDaoImpl.getCourseTable().forEach(course -> {
                if(course.getCourseName().contains(name)){
                    courses.add(course);
                }else if(course.getCourseId().contains(name)){
                    courses.add(course);
                }else if(course.getCourseTime().contains(name)){
                    courses.add(course);
                }else if(course.getCourseType().contains(name)){
                    courses.add(course);
                }else if(course.getDescription().contains(name)){
                    courses.add(course);
                }else if(course.getOperator().contains(name)){
                    courses.add(course);
                }
            });
        } else {
            courses.addAll(CourseDaoImpl.getCourseTable());
        }

        int start = (page - 1) * size;
        int end = courses.size() >= page * size ? page * size : courses.size();
        return courses.subList(start, end);
    }

//    public static int getCoursesCount(String name) {
//        List<Course> courses = new ArrayList<>();
//
//        if (null != name && !"".equals(name)) {
//
//            CourseDaoImpl.getCourseTable().forEach(course -> {
//                if(course.getCourseName().contains(name)){
//                    courses.add(course);
//                }
//            });
//        } else {
//            courses.addAll(CourseDaoImpl.getCourseTable());
//        }
//        return courses.size();
//    }
}
